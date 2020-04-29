package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.YouzanOrderRecordModel;
import com.evan.springboot.tpi.mapper.YouzanOrderRecordDao;
import com.evan.springboot.tpi.service.IYouzanOrderRecordProvider;
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
public class YouzanOrderRecordProvider extends ServiceImpl<YouzanOrderRecordDao, YouzanOrderRecordModel> implements IYouzanOrderRecordProvider {

}
