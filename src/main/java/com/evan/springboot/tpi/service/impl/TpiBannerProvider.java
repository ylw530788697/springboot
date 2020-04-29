package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiBannerModel;
import com.evan.springboot.tpi.mapper.TpiBannerDao;
import com.evan.springboot.tpi.service.ITpiBannerProvider;
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
public class TpiBannerProvider extends ServiceImpl<TpiBannerDao, TpiBannerModel> implements ITpiBannerProvider {

}
