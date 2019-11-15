package com.general.service.impl;

import com.general.model.UserModel;
import com.general.mapper.UserDao;
import com.general.service.UserProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2019-11-15
 */
@Service
public class UserProviderImpl extends ServiceImpl<UserDao, UserModel> implements UserProvider {

}
