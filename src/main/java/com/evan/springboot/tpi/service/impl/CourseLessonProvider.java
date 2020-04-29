package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseLessonModel;
import com.evan.springboot.tpi.mapper.CourseLessonDao;
import com.evan.springboot.tpi.service.ICourseLessonProvider;
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
public class CourseLessonProvider extends ServiceImpl<CourseLessonDao, CourseLessonModel> implements ICourseLessonProvider {

}
