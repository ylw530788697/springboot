package com.general.service.impl;

import com.general.model.ChildModel;
import com.general.mapper.ChildDao;
import com.general.service.ChildProvider;
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
public class ChildProviderImpl extends ServiceImpl<ChildDao, ChildModel> implements ChildProvider {

}
