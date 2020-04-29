package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiUserGetRecordModel;
import com.evan.springboot.tpi.mapper.TpiUserGetRecordDao;
import com.evan.springboot.tpi.service.ITpiUserGetRecordProvider;
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
public class TpiUserGetRecordProvider extends ServiceImpl<TpiUserGetRecordDao, TpiUserGetRecordModel> implements ITpiUserGetRecordProvider {

}
