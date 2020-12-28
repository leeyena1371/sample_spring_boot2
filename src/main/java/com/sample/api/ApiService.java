package com.sample.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    @Autowired
    public ApiMapper apiMapper;

    public List<ApiModel> selectTest(){
        return apiMapper.selectTest();
    }
}
