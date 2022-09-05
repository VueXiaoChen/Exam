package com.example.wiki.mapper;

import com.example.wiki.domain.ExaPaperQuestionCustomerAnswer;
import com.example.wiki.domain.ExaPaperQuestionCustomerAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExaPaperQuestionCustomerAnswerMapper {
    long countByExample(ExaPaperQuestionCustomerAnswerExample example);

    int deleteByExample(ExaPaperQuestionCustomerAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExaPaperQuestionCustomerAnswer row);

    int insertSelective(ExaPaperQuestionCustomerAnswer row);

    List<ExaPaperQuestionCustomerAnswer> selectByExample(ExaPaperQuestionCustomerAnswerExample example);

    ExaPaperQuestionCustomerAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") ExaPaperQuestionCustomerAnswer row, @Param("example") ExaPaperQuestionCustomerAnswerExample example);

    int updateByExample(@Param("row") ExaPaperQuestionCustomerAnswer row, @Param("example") ExaPaperQuestionCustomerAnswerExample example);

    int updateByPrimaryKeySelective(ExaPaperQuestionCustomerAnswer row);

    int updateByPrimaryKey(ExaPaperQuestionCustomerAnswer row);
}