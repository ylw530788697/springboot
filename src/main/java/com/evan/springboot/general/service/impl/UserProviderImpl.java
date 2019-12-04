package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.UserModel;
import com.evan.springboot.general.mapper.UserDao;
import com.evan.springboot.general.service.UserProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
