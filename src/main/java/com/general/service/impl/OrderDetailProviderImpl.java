package com.general.service.impl;

import com.general.model.OrderDetailModel;
import com.general.mapper.OrderDetailDao;
import com.general.service.OrderDetailProvider;
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
public class OrderDetailProviderImpl extends ServiceImpl<OrderDetailDao, OrderDetailModel> implements OrderDetailProvider {

}
