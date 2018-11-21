package com.dianshang.mapper;

import com.dianshang.pojo.TbContent;
import com.dianshang.pojo.TbContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentMapper {
    int countByExample(TbContentExample example);

    int deleteByExample(TbContentExample example);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    List<TbContent> selectByExample(TbContentExample example);

    int updateByExampleSelective(@Param("record") TbContent record,
            @Param("example") TbContentExample example);

    int updateByExample(@Param("record") TbContent record,
            @Param("example") TbContentExample example);
}
