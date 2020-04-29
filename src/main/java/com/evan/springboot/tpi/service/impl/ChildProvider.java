package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.ChildModel;
import com.evan.springboot.tpi.mapper.ChildDao;
import com.evan.springboot.tpi.service.IChildProvider;
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
public class ChildProvider extends ServiceImpl<ChildDao, ChildModel> implements IChildProvider {

}
