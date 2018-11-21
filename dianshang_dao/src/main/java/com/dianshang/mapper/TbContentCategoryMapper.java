package com.dianshang.mapper;

import com.dianshang.pojo.TbContentCategory;
import com.dianshang.pojo.TbContentCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentCategoryMapper {
    int countByExample(TbContentCategoryExample example);

    int deleteByExample(TbContentCategoryExample example);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    int updateByExampleSelective(@Param("record") TbContentCategory record,
            @Param("example") TbContentCategoryExample example);

    int updateByExample(@Param("record") TbContentCategory record,
            @Param("example") TbContentCategoryExample example);
}
