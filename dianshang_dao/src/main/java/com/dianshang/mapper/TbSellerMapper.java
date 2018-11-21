package com.dianshang.mapper;

import com.dianshang.pojo.TbSeller;
import com.dianshang.pojo.TbSellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSellerMapper {
    int countByExample(TbSellerExample example);

    int deleteByExample(TbSellerExample example);

    int insert(TbSeller record);

    int insertSelective(TbSeller record);

    List<TbSeller> selectByExample(TbSellerExample example);

    int updateByExampleSelective(@Param("record") TbSeller record,
            @Param("example") TbSellerExample example);

    int updateByExample(@Param("record") TbSeller record, @Param("example") TbSellerExample example);
}
