package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.SkAppCustomerModel;
import com.evan.springboot.tpi.mapper.SkAppCustomerDao;
import com.evan.springboot.tpi.service.ISkAppCustomerProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员信息表 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Service
public class SkAppCustomerProvider extends ServiceImpl<SkAppCustomerDao, SkAppCustomerModel> implements ISkAppCustomerProvider {

}
