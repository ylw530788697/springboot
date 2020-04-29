package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.BannerModel;
import com.evan.springboot.tpi.mapper.BannerDao;
import com.evan.springboot.tpi.service.IBannerProvider;
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
public class BannerProvider extends ServiceImpl<BannerDao, BannerModel> implements IBannerProvider {

}
