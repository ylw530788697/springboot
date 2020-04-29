package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiVideoDetailModel;
import com.evan.springboot.tpi.mapper.TpiVideoDetailDao;
import com.evan.springboot.tpi.service.ITpiVideoDetailProvider;
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
public class TpiVideoDetailProvider extends ServiceImpl<TpiVideoDetailDao, TpiVideoDetailModel> implements ITpiVideoDetailProvider {

}
