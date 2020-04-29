package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseLessonRelationModel;
import com.evan.springboot.tpi.mapper.CourseLessonRelationDao;
import com.evan.springboot.tpi.service.ICourseLessonRelationProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课包课时和已上线课时表 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Service
public class CourseLessonRelationProvider extends ServiceImpl<CourseLessonRelationDao, CourseLessonRelationModel> implements ICourseLessonRelationProvider {

}
