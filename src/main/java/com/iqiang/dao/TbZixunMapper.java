package com.iqiang.dao;

import com.iqiang.pojo.TbZixun;
import com.iqiang.pojo.TbZixunExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbZixunMapper {
    int countByExample(TbZixunExample example);

    int deleteByExample(TbZixunExample example);

    int insert(TbZixun record);

    int insertSelective(TbZixun record);

    List<TbZixun> selectByExample(TbZixunExample example);

    int updateByExampleSelective(@Param("record") TbZixun record, @Param("example") TbZixunExample example);

    int updateByExample(@Param("record") TbZixun record, @Param("example") TbZixunExample example);
}