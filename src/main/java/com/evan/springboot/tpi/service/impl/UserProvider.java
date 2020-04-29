package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.UserModel;
import com.evan.springboot.tpi.mapper.UserDao;
import com.evan.springboot.tpi.service.IUserProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Service
public class UserProvider extends ServiceImpl<UserDao, UserModel> implements IUserProvider {

}
