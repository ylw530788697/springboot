package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.CourseOptionModel;
import com.evan.springboot.general.mapper.CourseOptionDao;
import com.evan.springboot.general.service.CourseOptionProvider;
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
public class CourseOptionProviderImpl extends ServiceImpl<CourseOptionDao, CourseOptionModel> implements CourseOptionProvider {

}
