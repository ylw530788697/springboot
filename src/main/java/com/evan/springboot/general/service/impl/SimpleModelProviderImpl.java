package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.SimpleModelModel;
import com.evan.springboot.general.mapper.SimpleModelDao;
import com.evan.springboot.general.service.SimpleModelProvider;
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
public class SimpleModelProviderImpl extends ServiceImpl<SimpleModelDao, SimpleModelModel> implements SimpleModelProvider {

}
