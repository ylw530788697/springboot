package com.general.service.impl;

import com.general.model.CourseLessonRelationModel;
import com.general.mapper.CourseLessonRelationDao;
import com.general.service.CourseLessonRelationProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课包课时和已上线课时表 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2019-11-15
 */
@Service
public class CourseLessonRelationProviderImpl extends ServiceImpl<CourseLessonRelationDao, CourseLessonRelationModel> implements CourseLessonRelationProvider {

}
