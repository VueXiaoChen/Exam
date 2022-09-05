package com.example.wiki.mapper;

import com.example.wiki.domain.ExamPaperAnswer;
import com.example.wiki.domain.ExamPaperAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamPaperAnswerMapper {
    long countByExample(ExamPaperAnswerExample example);

    int deleteByExample(ExamPaperAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamPaperAnswer row);

    int insertSelective(ExamPaperAnswer row);

    List<ExamPaperAnswer> selectByExample(ExamPaperAnswerExample example);

    ExamPaperAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") ExamPaperAnswer row, @Param("example") ExamPaperAnswerExample example);

    int updateByExample(@Param("row") ExamPaperAnswer row, @Param("example") ExamPaperAnswerExample example);

    int updateByPrimaryKeySelective(ExamPaperAnswer row);

    int updateByPrimaryKey(ExamPaperAnswer row);
}