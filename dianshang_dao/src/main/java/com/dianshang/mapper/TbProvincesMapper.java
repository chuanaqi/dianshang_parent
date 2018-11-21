package com.dianshang.mapper;

import com.dianshang.pojo.TbProvinces;
import com.dianshang.pojo.TbProvincesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProvincesMapper {
    int countByExample(TbProvincesExample example);

    int deleteByExample(TbProvincesExample example);

    int insert(TbProvinces record);

    int insertSelective(TbProvinces record);

    List<TbProvinces> selectByExample(TbProvincesExample example);

    int updateByExampleSelective(@Param("record") TbProvinces record,
            @Param("example") TbProvincesExample example);

    int updateByExample(@Param("record") TbProvinces record,
            @Param("example") TbProvincesExample example);
}
