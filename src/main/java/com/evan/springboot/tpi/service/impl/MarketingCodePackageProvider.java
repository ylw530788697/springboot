package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.MarketingCodePackageModel;
import com.evan.springboot.tpi.mapper.MarketingCodePackageDao;
import com.evan.springboot.tpi.service.IMarketingCodePackageProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 兑换码包 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Service
public class MarketingCodePackageProvider extends ServiceImpl<MarketingCodePackageDao, MarketingCodePackageModel> implements IMarketingCodePackageProvider {

}
