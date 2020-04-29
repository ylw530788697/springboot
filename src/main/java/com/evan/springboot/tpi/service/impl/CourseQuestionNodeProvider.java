package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseQuestionNodeModel;
import com.evan.springboot.tpi.mapper.CourseQuestionNodeDao;
import com.evan.springboot.tpi.service.ICourseQuestionNodeProvider;
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
public class CourseQuestionNodeProvider extends ServiceImpl<CourseQuestionNodeDao, CourseQuestionNodeModel> implements ICourseQuestionNodeProvider {

}
