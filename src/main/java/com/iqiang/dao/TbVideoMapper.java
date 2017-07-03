package com.iqiang.dao;

import com.iqiang.pojo.TbVideo;
import com.iqiang.pojo.TbVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbVideoMapper {
    int countByExample(TbVideoExample example);

    int deleteByExample(TbVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbVideo record);

    int insertSelective(TbVideo record);

    List<TbVideo> selectByExample(TbVideoExample example);

    TbVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbVideo record, @Param("example") TbVideoExample example);

    int updateByExample(@Param("record") TbVideo record, @Param("example") TbVideoExample example);

    int updateByPrimaryKeySelective(TbVideo record);

    int updateByPrimaryKey(TbVideo record);
}