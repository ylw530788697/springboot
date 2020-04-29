package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiVideoAlbumModel;
import com.evan.springboot.tpi.mapper.TpiVideoAlbumDao;
import com.evan.springboot.tpi.service.ITpiVideoAlbumProvider;
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
public class TpiVideoAlbumProvider extends ServiceImpl<TpiVideoAlbumDao, TpiVideoAlbumModel> implements ITpiVideoAlbumProvider {

}
