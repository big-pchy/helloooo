package com.peach.service;

import com.alibaba.fastjson.JSON;
import com.peach.entity.Linux;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:peach
 * @Date:2021/10/12 09:26
 * @Content:操作linux类
 */
@Service
public class LinuxService {

    public void linux(){
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        BufferedReader reader = null;
        try {
            process = runtime.exec("lsof -i:8846");
            reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = null;
            List<String> list = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                System.out.println("***   " + line);
                list.add(line);
            }
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            process.destroy();
        }
    }

}
