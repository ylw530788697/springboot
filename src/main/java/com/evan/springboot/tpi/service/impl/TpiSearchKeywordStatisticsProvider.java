package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiSearchKeywordStatisticsModel;
import com.evan.springboot.tpi.mapper.TpiSearchKeywordStatisticsDao;
import com.evan.springboot.tpi.service.ITpiSearchKeywordStatisticsProvider;
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
public class TpiSearchKeywordStatisticsProvider extends ServiceImpl<TpiSearchKeywordStatisticsDao, TpiSearchKeywordStatisticsModel> implements ITpiSearchKeywordStatisticsProvider {

}
