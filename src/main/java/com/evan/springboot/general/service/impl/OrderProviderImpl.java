package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.OrderModel;
import com.evan.springboot.general.mapper.OrderDao;
import com.evan.springboot.general.service.OrderProvider;
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
public class OrderProviderImpl extends ServiceImpl<OrderDao, OrderModel> implements OrderProvider {

}
