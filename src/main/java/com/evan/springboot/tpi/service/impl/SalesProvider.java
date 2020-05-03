package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.SalesModel;
import com.evan.springboot.tpi.mapper.SalesDao;
import com.evan.springboot.tpi.service.ISalesProvider;
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
public class SalesProvider extends ServiceImpl<SalesDao, SalesModel> implements ISalesProvider {

}