package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiUserCollectModel;
import com.evan.springboot.tpi.mapper.TpiUserCollectDao;
import com.evan.springboot.tpi.service.ITpiUserCollectProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户搜藏歌曲 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Service
public class TpiUserCollectProvider extends ServiceImpl<TpiUserCollectDao, TpiUserCollectModel> implements ITpiUserCollectProvider {

}
