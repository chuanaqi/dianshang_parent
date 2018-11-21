package com.dianshang.mapper;

import com.dianshang.pojo.TbItemCat;
import com.dianshang.pojo.TbItemCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCatMapper {
    int countByExample(TbItemCatExample example);

    int deleteByExample(TbItemCatExample example);

    int insert(TbItemCat record);

    int insertSelective(TbItemCat record);

    List<TbItemCat> selectByExample(TbItemCatExample example);

    int updateByExampleSelective(@Param("record") TbItemCat record,
            @Param("example") TbItemCatExample example);

    int updateByExample(@Param("record") TbItemCat record,
            @Param("example") TbItemCatExample example);
}
