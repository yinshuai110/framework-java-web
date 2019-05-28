package com.winter.base.framework.service;

import com.winter.base.framework.entity.bean.OmsUser;
import com.winter.base.framework.entity.bean.OmsUserExample;
import com.winter.base.framework.entity.mapper.OmsUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    OmsUserMapper userMapper;

    public String getUserName() {
        OmsUserExample example = new OmsUserExample();
        example.or().andUidEqualTo("ys");
        List<OmsUser> list = userMapper.selectByExample(example);

        return list.get(0).getPassword();
    }

}
