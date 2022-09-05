package com.example.wiki.mapper;

import com.example.wiki.domain.UserEventLog;
import com.example.wiki.domain.UserEventLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEventLogMapper {
    long countByExample(UserEventLogExample example);

    int deleteByExample(UserEventLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserEventLog row);

    int insertSelective(UserEventLog row);

    List<UserEventLog> selectByExampleWithBLOBs(UserEventLogExample example);

    List<UserEventLog> selectByExample(UserEventLogExample example);

    UserEventLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UserEventLog row, @Param("example") UserEventLogExample example);

    int updateByExampleWithBLOBs(@Param("row") UserEventLog row, @Param("example") UserEventLogExample example);

    int updateByExample(@Param("row") UserEventLog row, @Param("example") UserEventLogExample example);

    int updateByPrimaryKeySelective(UserEventLog row);

    int updateByPrimaryKeyWithBLOBs(UserEventLog row);

    int updateByPrimaryKey(UserEventLog row);
}