package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.CourseCategoryModel;
import com.evan.springboot.general.mapper.CourseCategoryDao;
import com.evan.springboot.general.service.CourseCategoryProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2019-11-15
 */
@Service
public class CourseCategoryProviderImpl extends ServiceImpl<CourseCategoryDao, CourseCategoryModel> implements CourseCategoryProvider {

}
