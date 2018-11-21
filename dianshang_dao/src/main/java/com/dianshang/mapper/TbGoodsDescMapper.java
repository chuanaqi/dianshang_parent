package com.dianshang.mapper;

import com.dianshang.pojo.TbGoodsDesc;
import com.dianshang.pojo.TbGoodsDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGoodsDescMapper {
    int countByExample(TbGoodsDescExample example);

    int deleteByExample(TbGoodsDescExample example);

    int insert(TbGoodsDesc record);

    int insertSelective(TbGoodsDesc record);

    List<TbGoodsDesc> selectByExample(TbGoodsDescExample example);

    int updateByExampleSelective(@Param("record") TbGoodsDesc record,
            @Param("example") TbGoodsDescExample example);

    int updateByExample(@Param("record") TbGoodsDesc record,
            @Param("example") TbGoodsDescExample example);
}
