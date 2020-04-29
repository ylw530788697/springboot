package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiIosReceiptsModel;
import com.evan.springboot.tpi.mapper.TpiIosReceiptsDao;
import com.evan.springboot.tpi.service.ITpiIosReceiptsProvider;
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
public class TpiIosReceiptsProvider extends ServiceImpl<TpiIosReceiptsDao, TpiIosReceiptsModel> implements ITpiIosReceiptsProvider {

}
