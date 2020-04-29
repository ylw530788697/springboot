package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiSearchLogModel;
import com.evan.springboot.tpi.mapper.TpiSearchLogDao;
import com.evan.springboot.tpi.service.ITpiSearchLogProvider;
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
public class TpiSearchLogProvider extends ServiceImpl<TpiSearchLogDao, TpiSearchLogModel> implements ITpiSearchLogProvider {

}
