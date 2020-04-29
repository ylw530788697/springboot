package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseClickNodeModel;
import com.evan.springboot.tpi.mapper.CourseClickNodeDao;
import com.evan.springboot.tpi.service.ICourseClickNodeProvider;
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
public class CourseClickNodeProvider extends ServiceImpl<CourseClickNodeDao, CourseClickNodeModel> implements ICourseClickNodeProvider {

}
