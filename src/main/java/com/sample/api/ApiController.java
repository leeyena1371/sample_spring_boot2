package com.sample.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/test")
    public List<ApiModel> test(){
        List<ApiModel> list = apiService.selectTest();

        return list;
    }
}
