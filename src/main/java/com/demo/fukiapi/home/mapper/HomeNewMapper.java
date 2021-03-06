package com.demo.fukiapi.home.mapper;

import com.demo.fukiapi.home.po.HomeNew;
import com.demo.fukiapi.home.po.HomeNewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomeNewMapper {
    int countByExample(HomeNewExample example);

    int deleteByExample(HomeNewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HomeNew record);

    int insertSelective(HomeNew record);

    List<HomeNew> selectByExample(HomeNewExample example);

    HomeNew selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HomeNew record, @Param("example") HomeNewExample example);

    int updateByExample(@Param("record") HomeNew record, @Param("example") HomeNewExample example);

    int updateByPrimaryKeySelective(HomeNew record);

    int updateByPrimaryKey(HomeNew record);
}