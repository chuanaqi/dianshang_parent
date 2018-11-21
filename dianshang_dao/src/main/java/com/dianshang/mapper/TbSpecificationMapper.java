package com.dianshang.mapper;

import com.dianshang.pojo.TbSpecification;
import com.dianshang.pojo.TbSpecificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSpecificationMapper {
    int countByExample(TbSpecificationExample example);

    int deleteByExample(TbSpecificationExample example);

    int insert(TbSpecification record);

    int insertSelective(TbSpecification record);

    List<TbSpecification> selectByExample(TbSpecificationExample example);

    int updateByExampleSelective(@Param("record") TbSpecification record,
            @Param("example") TbSpecificationExample example);

    int updateByExample(@Param("record") TbSpecification record,
            @Param("example") TbSpecificationExample example);
}
