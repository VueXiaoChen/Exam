package com.example.wiki.mapper;

import com.example.wiki.domain.UserToken;
import com.example.wiki.domain.UserTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTokenMapper {
    long countByExample(UserTokenExample example);

    int deleteByExample(UserTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserToken row);

    int insertSelective(UserToken row);

    List<UserToken> selectByExample(UserTokenExample example);

    UserToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UserToken row, @Param("example") UserTokenExample example);

    int updateByExample(@Param("row") UserToken row, @Param("example") UserTokenExample example);

    int updateByPrimaryKeySelective(UserToken row);

    int updateByPrimaryKey(UserToken row);
}