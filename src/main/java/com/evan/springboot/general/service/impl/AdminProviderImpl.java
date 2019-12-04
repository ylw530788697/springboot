package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.AdminModel;
import com.evan.springboot.general.mapper.AdminDao;
import com.evan.springboot.general.service.AdminProvider;
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
public class AdminProviderImpl extends ServiceImpl<AdminDao, AdminModel> implements AdminProvider {

}
