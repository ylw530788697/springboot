package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiUserVipModel;
import com.evan.springboot.tpi.mapper.TpiUserVipDao;
import com.evan.springboot.tpi.service.ITpiUserVipProvider;
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
public class TpiUserVipProvider extends ServiceImpl<TpiUserVipDao, TpiUserVipModel> implements ITpiUserVipProvider {

}
