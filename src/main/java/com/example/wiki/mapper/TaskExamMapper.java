package com.example.wiki.mapper;

import com.example.wiki.domain.TaskExam;
import com.example.wiki.domain.TaskExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskExamMapper {
    long countByExample(TaskExamExample example);

    int deleteByExample(TaskExamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskExam row);

    int insertSelective(TaskExam row);

    List<TaskExam> selectByExample(TaskExamExample example);

    TaskExam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TaskExam row, @Param("example") TaskExamExample example);

    int updateByExample(@Param("row") TaskExam row, @Param("example") TaskExamExample example);

    int updateByPrimaryKeySelective(TaskExam row);

    int updateByPrimaryKey(TaskExam row);
}