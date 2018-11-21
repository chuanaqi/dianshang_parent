package com.dianshang.mapper;

import com.dianshang.pojo.TbTypeTemplate;
import com.dianshang.pojo.TbTypeTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTypeTemplateMapper {
    int countByExample(TbTypeTemplateExample example);

    int deleteByExample(TbTypeTemplateExample example);

    int insert(TbTypeTemplate record);

    int insertSelective(TbTypeTemplate record);

    List<TbTypeTemplate> selectByExample(TbTypeTemplateExample example);

    int updateByExampleSelective(@Param("record") TbTypeTemplate record,
            @Param("example") TbTypeTemplateExample example);

    int updateByExample(@Param("record") TbTypeTemplate record,
            @Param("example") TbTypeTemplateExample example);
}
