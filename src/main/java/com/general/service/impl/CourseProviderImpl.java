package com.general.service.impl;

import com.general.model.CourseModel;
import com.general.mapper.CourseDao;
import com.general.service.CourseProvider;
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
public class CourseProviderImpl extends ServiceImpl<CourseDao, CourseModel> implements CourseProvider {

}
