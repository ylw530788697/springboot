package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseQuestionModel;
import com.evan.springboot.tpi.mapper.CourseQuestionDao;
import com.evan.springboot.tpi.service.ICourseQuestionProvider;
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
public class CourseQuestionProvider extends ServiceImpl<CourseQuestionDao, CourseQuestionModel> implements ICourseQuestionProvider {

}
