package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiMusicDetailModel;
import com.evan.springboot.tpi.mapper.TpiMusicDetailDao;
import com.evan.springboot.tpi.service.ITpiMusicDetailProvider;
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
public class TpiMusicDetailProvider extends ServiceImpl<TpiMusicDetailDao, TpiMusicDetailModel> implements ITpiMusicDetailProvider {

}
