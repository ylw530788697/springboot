package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.SkAppPlayOrderModel;
import com.evan.springboot.tpi.mapper.SkAppPlayOrderDao;
import com.evan.springboot.tpi.service.ISkAppPlayOrderProvider;
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
public class SkAppPlayOrderProvider extends ServiceImpl<SkAppPlayOrderDao, SkAppPlayOrderModel> implements ISkAppPlayOrderProvider {

}
