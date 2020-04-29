package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.SystemVariableModel;
import com.evan.springboot.tpi.mapper.SystemVariableDao;
import com.evan.springboot.tpi.service.ISystemVariableProvider;
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
public class SystemVariableProvider extends ServiceImpl<SystemVariableDao, SystemVariableModel> implements ISystemVariableProvider {

}
