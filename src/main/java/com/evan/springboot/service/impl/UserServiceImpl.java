package com.evan.springboot.service.impl;

import com.evan.springboot.pojo.User;
import com.evan.springboot.mapper.UserMapper;
import com.evan.springboot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Evan
 * @since 2019-11-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
