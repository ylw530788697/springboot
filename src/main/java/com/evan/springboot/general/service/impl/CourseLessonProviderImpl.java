package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.CourseLessonModel;
import com.evan.springboot.general.mapper.CourseLessonDao;
import com.evan.springboot.general.service.CourseLessonProvider;
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
public class CourseLessonProviderImpl extends ServiceImpl<CourseLessonDao, CourseLessonModel> implements CourseLessonProvider {

}
