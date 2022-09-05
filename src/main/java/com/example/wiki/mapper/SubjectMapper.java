package com.example.wiki.mapper;

import com.example.wiki.domain.Subject;
import com.example.wiki.domain.SubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectMapper {
    long countByExample(SubjectExample example);

    int deleteByExample(SubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Subject row);

    int insertSelective(Subject row);

    List<Subject> selectByExample(SubjectExample example);

    Subject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Subject row, @Param("example") SubjectExample example);

    int updateByExample(@Param("row") Subject row, @Param("example") SubjectExample example);

    int updateByPrimaryKeySelective(Subject row);

    int updateByPrimaryKey(Subject row);
}