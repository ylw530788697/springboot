package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseModel;
import com.evan.springboot.tpi.mapper.CourseDao;
import com.evan.springboot.tpi.service.ICourseProvider;
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
public class CourseProvider extends ServiceImpl<CourseDao, CourseModel> implements ICourseProvider {

}
