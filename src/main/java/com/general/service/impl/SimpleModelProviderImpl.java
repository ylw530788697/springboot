package com.general.service.impl;

import com.general.model.SimpleModelModel;
import com.general.mapper.SimpleModelDao;
import com.general.service.SimpleModelProvider;
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
