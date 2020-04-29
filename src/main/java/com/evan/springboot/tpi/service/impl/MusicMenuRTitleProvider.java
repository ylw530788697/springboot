package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.MusicMenuRTitleModel;
import com.evan.springboot.tpi.mapper.MusicMenuRTitleDao;
import com.evan.springboot.tpi.service.IMusicMenuRTitleProvider;
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
public class MusicMenuRTitleProvider extends ServiceImpl<MusicMenuRTitleDao, MusicMenuRTitleModel> implements IMusicMenuRTitleProvider {

}
