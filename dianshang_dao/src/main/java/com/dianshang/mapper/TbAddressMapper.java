package com.dianshang.mapper;

import com.dianshang.pojo.TbAddress;
import com.dianshang.pojo.TbAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAddressMapper {
    int countByExample(TbAddressExample example);

    int deleteByExample(TbAddressExample example);

    int insert(TbAddress record);

    int insertSelective(TbAddress record);

    List<TbAddress> selectByExample(TbAddressExample example);

    int updateByExampleSelective(@Param("record") TbAddress record,
            @Param("example") TbAddressExample example);

    int updateByExample(@Param("record") TbAddress record,
            @Param("example") TbAddressExample example);
}
