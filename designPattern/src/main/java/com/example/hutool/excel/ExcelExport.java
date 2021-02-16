package com.example.hutool.excel;

import cn.hutool.core.io.IoUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.poi.excel.ExcelWriter;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("hutool/excel")
public class ExcelExport {

    @RequestMapping(path = "/export",method = RequestMethod.GET)
    public  void export(HttpServletResponse response){
        List<JSONObject> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            JSONObject object=new JSONObject();
            object.put("name","abc_"+i);
            object.put("age",i);
            object.put("birthday",new Date());
            list.add(object);
        }

        ExcelWriter excelWriter=new ExcelWriter();
        excelWriter.addHeaderAlias("name","姓名");
        excelWriter.addHeaderAlias("age","年龄");
        excelWriter.addHeaderAlias("birthday","生日");

        excelWriter.merge(2,"申请人员信息");

        excelWriter.write(list,true);
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        String name=  "applySchool";
        response.setHeader("Content-Disposition","attachment;filename="+name+".xls");
        ServletOutputStream out=null;
        try {
            out= response.getOutputStream();
            excelWriter.flush(out,true);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            excelWriter.close();
        }
        IoUtil.close(out);


    }

}
