package com.dianshang.mapper;

import com.dianshang.pojo.TbOrderItem;
import com.dianshang.pojo.TbOrderItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderItemMapper {
    int countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    int updateByExampleSelective(@Param("record") TbOrderItem record,
            @Param("example") TbOrderItemExample example);

    int updateByExample(@Param("record") TbOrderItem record,
            @Param("example") TbOrderItemExample example);
}
