package com.sample.api;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApiMapper {
    List<ApiModel> selectTest();
}
