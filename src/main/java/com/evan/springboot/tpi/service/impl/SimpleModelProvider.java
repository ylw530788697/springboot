package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.SimpleModelModel;
import com.evan.springboot.tpi.mapper.SimpleModelDao;
import com.evan.springboot.tpi.service.ISimpleModelProvider;
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
public class SimpleModelProvider extends ServiceImpl<SimpleModelDao, SimpleModelModel> implements ISimpleModelProvider {

}
