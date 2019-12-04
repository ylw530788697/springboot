package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.ChildModel;
import com.evan.springboot.general.mapper.ChildDao;
import com.evan.springboot.general.service.ChildProvider;
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
