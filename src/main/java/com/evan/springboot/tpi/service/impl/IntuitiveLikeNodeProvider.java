package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.IntuitiveLikeNodeModel;
import com.evan.springboot.tpi.mapper.IntuitiveLikeNodeDao;
import com.evan.springboot.tpi.service.IIntuitiveLikeNodeProvider;
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
public class IntuitiveLikeNodeProvider extends ServiceImpl<IntuitiveLikeNodeDao, IntuitiveLikeNodeModel> implements IIntuitiveLikeNodeProvider {

}
