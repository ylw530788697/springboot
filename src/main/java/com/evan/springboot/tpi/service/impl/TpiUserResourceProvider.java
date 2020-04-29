package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiUserResourceModel;
import com.evan.springboot.tpi.mapper.TpiUserResourceDao;
import com.evan.springboot.tpi.service.ITpiUserResourceProvider;
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
public class TpiUserResourceProvider extends ServiceImpl<TpiUserResourceDao, TpiUserResourceModel> implements ITpiUserResourceProvider {

}
