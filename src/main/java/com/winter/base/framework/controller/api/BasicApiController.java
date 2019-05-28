package com.winter.base.framework.controller.api;


import com.winter.base.framework.entity.bean.OmsUser;
import com.winter.base.framework.entity.bean.OmsUserExample;
import com.winter.base.framework.entity.mapper.OmsUserMapper;
import com.winter.base.framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BasicApiController {
    @Autowired
    UserService userService;

    @RequestMapping("getUser")
    public String getUserName() {
        return userService.getUserName();
    }
}
