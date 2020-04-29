package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.OrderDetailModel;
import com.evan.springboot.tpi.mapper.OrderDetailDao;
import com.evan.springboot.tpi.service.IOrderDetailProvider;
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
public class OrderDetailProvider extends ServiceImpl<OrderDetailDao, OrderDetailModel> implements IOrderDetailProvider {

}
