package com.example.wiki.mapper;

import com.example.wiki.domain.TextContent;
import com.example.wiki.domain.TextContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextContentMapper {
    long countByExample(TextContentExample example);

    int deleteByExample(TextContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TextContent row);

    int insertSelective(TextContent row);

    List<TextContent> selectByExampleWithBLOBs(TextContentExample example);

    List<TextContent> selectByExample(TextContentExample example);

    TextContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TextContent row, @Param("example") TextContentExample example);

    int updateByExampleWithBLOBs(@Param("row") TextContent row, @Param("example") TextContentExample example);

    int updateByExample(@Param("row") TextContent row, @Param("example") TextContentExample example);

    int updateByPrimaryKeySelective(TextContent row);

    int updateByPrimaryKeyWithBLOBs(TextContent row);

    int updateByPrimaryKey(TextContent row);
}