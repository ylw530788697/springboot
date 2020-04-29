package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiMusicMenuModel;
import com.evan.springboot.tpi.mapper.TpiMusicMenuDao;
import com.evan.springboot.tpi.service.ITpiMusicMenuProvider;
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
public class TpiMusicMenuProvider extends ServiceImpl<TpiMusicMenuDao, TpiMusicMenuModel> implements ITpiMusicMenuProvider {

}
