package com.example.mybatis.sys.service.impl;

import com.example.mybatis.sys.entity.User;
import com.example.mybatis.sys.mapper.UserMapper;
import com.example.mybatis.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author duke
 * @since 2019-04-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
