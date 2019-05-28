package com.winter.base.framework.entity.mapper;

import com.winter.base.framework.entity.bean.OmsUser;
import com.winter.base.framework.entity.bean.OmsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OmsUserMapper {
    long countByExample(OmsUserExample example);

    int deleteByExample(OmsUserExample example);

    int insert(OmsUser record);

    int insertSelective(OmsUser record);

    List<OmsUser> selectByExample(OmsUserExample example);

    int updateByExampleSelective(@Param("record") OmsUser record, @Param("example") OmsUserExample example);

    int updateByExample(@Param("record") OmsUser record, @Param("example") OmsUserExample example);
}