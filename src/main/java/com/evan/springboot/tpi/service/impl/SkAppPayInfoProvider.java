package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.SkAppPayInfoModel;
import com.evan.springboot.tpi.mapper.SkAppPayInfoDao;
import com.evan.springboot.tpi.service.ISkAppPayInfoProvider;
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
public class SkAppPayInfoProvider extends ServiceImpl<SkAppPayInfoDao, SkAppPayInfoModel> implements ISkAppPayInfoProvider {

}
