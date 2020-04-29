package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiDailyPracticeModel;
import com.evan.springboot.tpi.mapper.TpiDailyPracticeDao;
import com.evan.springboot.tpi.service.ITpiDailyPracticeProvider;
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
public class TpiDailyPracticeProvider extends ServiceImpl<TpiDailyPracticeDao, TpiDailyPracticeModel> implements ITpiDailyPracticeProvider {

}
