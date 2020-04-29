package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseCategoryModel;
import com.evan.springboot.tpi.mapper.CourseCategoryDao;
import com.evan.springboot.tpi.service.ICourseCategoryProvider;
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
public class CourseCategoryProvider extends ServiceImpl<CourseCategoryDao, CourseCategoryModel> implements ICourseCategoryProvider {

}
