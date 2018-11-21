package com.dianshang.mapper;

import com.dianshang.pojo.TbGoods;
import com.dianshang.pojo.TbGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGoodsMapper {
    int countByExample(TbGoodsExample example);

    int deleteByExample(TbGoodsExample example);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    List<TbGoods> selectByExample(TbGoodsExample example);

    int updateByExampleSelective(@Param("record") TbGoods record,
            @Param("example") TbGoodsExample example);

    int updateByExample(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);
}
