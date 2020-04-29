package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.MarketingCodeModel;
import com.evan.springboot.tpi.mapper.MarketingCodeDao;
import com.evan.springboot.tpi.service.IMarketingCodeProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 兑换码 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Service
public class MarketingCodeProvider extends ServiceImpl<MarketingCodeDao, MarketingCodeModel> implements IMarketingCodeProvider {

}
