package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.TpiCategoryModel;
import com.evan.springboot.tpi.mapper.TpiCategoryDao;
import com.evan.springboot.tpi.service.ITpiCategoryProvider;
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
public class TpiCategoryProvider extends ServiceImpl<TpiCategoryDao, TpiCategoryModel> implements ITpiCategoryProvider {

}
