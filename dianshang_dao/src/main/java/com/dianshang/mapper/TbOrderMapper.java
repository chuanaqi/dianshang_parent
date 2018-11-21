package com.dianshang.mapper;

import com.dianshang.pojo.TbOrder;
import com.dianshang.pojo.TbOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderMapper {
    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExample(TbOrderExample example);

    int updateByExampleSelective(@Param("record") TbOrder record,
            @Param("example") TbOrderExample example);

    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);
}
