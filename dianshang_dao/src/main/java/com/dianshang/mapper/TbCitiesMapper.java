package com.dianshang.mapper;

import com.dianshang.pojo.TbCities;
import com.dianshang.pojo.TbCitiesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCitiesMapper {
    int countByExample(TbCitiesExample example);

    int deleteByExample(TbCitiesExample example);

    int insert(TbCities record);

    int insertSelective(TbCities record);

    List<TbCities> selectByExample(TbCitiesExample example);

    int updateByExampleSelective(@Param("record") TbCities record,
            @Param("example") TbCitiesExample example);

    int updateByExample(@Param("record") TbCities record, @Param("example") TbCitiesExample example);
}
