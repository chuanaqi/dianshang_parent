package com.dianshang.mapper;

import com.dianshang.pojo.TbBrand;
import com.dianshang.pojo.TbBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbBrandMapper {
    int countByExample(TbBrandExample example);

    int deleteByExample(TbBrandExample example);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    List<TbBrand> selectByExample(TbBrandExample example);

    int updateByExampleSelective(@Param("record") TbBrand record,
            @Param("example") TbBrandExample example);

    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);
}
