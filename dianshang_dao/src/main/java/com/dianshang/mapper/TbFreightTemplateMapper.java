package com.dianshang.mapper;

import com.dianshang.pojo.TbFreightTemplate;
import com.dianshang.pojo.TbFreightTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbFreightTemplateMapper {
    int countByExample(TbFreightTemplateExample example);

    int deleteByExample(TbFreightTemplateExample example);

    int insert(TbFreightTemplate record);

    int insertSelective(TbFreightTemplate record);

    List<TbFreightTemplate> selectByExample(TbFreightTemplateExample example);

    int updateByExampleSelective(@Param("record") TbFreightTemplate record,
            @Param("example") TbFreightTemplateExample example);

    int updateByExample(@Param("record") TbFreightTemplate record,
            @Param("example") TbFreightTemplateExample example);
}
