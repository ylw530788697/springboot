package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.OrderRefundModel;
import com.evan.springboot.tpi.mapper.OrderRefundDao;
import com.evan.springboot.tpi.service.IOrderRefundProvider;
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
public class OrderRefundProvider extends ServiceImpl<OrderRefundDao, OrderRefundModel> implements IOrderRefundProvider {

}
