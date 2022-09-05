package com.example.wiki.mapper;

import com.example.wiki.domain.MessageUser;
import com.example.wiki.domain.MessageUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageUserMapper {
    long countByExample(MessageUserExample example);

    int deleteByExample(MessageUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageUser row);

    int insertSelective(MessageUser row);

    List<MessageUser> selectByExample(MessageUserExample example);

    MessageUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") MessageUser row, @Param("example") MessageUserExample example);

    int updateByExample(@Param("row") MessageUser row, @Param("example") MessageUserExample example);

    int updateByPrimaryKeySelective(MessageUser row);

    int updateByPrimaryKey(MessageUser row);
}