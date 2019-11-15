package com.general.service.impl;

import com.general.model.OrderModel;
import com.general.mapper.OrderDao;
import com.general.service.OrderProvider;
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
