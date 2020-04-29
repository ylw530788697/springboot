package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.AdminModel;
import com.evan.springboot.tpi.mapper.AdminDao;
import com.evan.springboot.tpi.service.IAdminProvider;
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
public class AdminProvider extends ServiceImpl<AdminDao, AdminModel> implements IAdminProvider {

}
