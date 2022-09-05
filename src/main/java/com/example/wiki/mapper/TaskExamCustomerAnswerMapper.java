package com.example.wiki.mapper;

import com.example.wiki.domain.TaskExamCustomerAnswer;
import com.example.wiki.domain.TaskExamCustomerAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskExamCustomerAnswerMapper {
    long countByExample(TaskExamCustomerAnswerExample example);

    int deleteByExample(TaskExamCustomerAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskExamCustomerAnswer row);

    int insertSelective(TaskExamCustomerAnswer row);

    List<TaskExamCustomerAnswer> selectByExample(TaskExamCustomerAnswerExample example);

    TaskExamCustomerAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TaskExamCustomerAnswer row, @Param("example") TaskExamCustomerAnswerExample example);

    int updateByExample(@Param("row") TaskExamCustomerAnswer row, @Param("example") TaskExamCustomerAnswerExample example);

    int updateByPrimaryKeySelective(TaskExamCustomerAnswer row);

    int updateByPrimaryKey(TaskExamCustomerAnswer row);
}