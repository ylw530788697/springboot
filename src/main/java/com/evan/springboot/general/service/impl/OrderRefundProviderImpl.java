package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.OrderRefundModel;
import com.evan.springboot.general.mapper.OrderRefundDao;
import com.evan.springboot.general.service.OrderRefundProvider;
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
public class OrderRefundProviderImpl extends ServiceImpl<OrderRefundDao, OrderRefundModel> implements OrderRefundProvider {

}
