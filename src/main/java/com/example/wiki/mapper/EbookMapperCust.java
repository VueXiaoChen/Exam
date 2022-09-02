package com.example.wiki.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EbookMapperCust {
    public void increaseEbook(@Param("id") long id);
}
