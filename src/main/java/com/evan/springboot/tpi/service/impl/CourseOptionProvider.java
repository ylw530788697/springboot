package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseOptionModel;
import com.evan.springboot.tpi.mapper.CourseOptionDao;
import com.evan.springboot.tpi.service.ICourseOptionProvider;
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
public class CourseOptionProvider extends ServiceImpl<CourseOptionDao, CourseOptionModel> implements ICourseOptionProvider {

}
