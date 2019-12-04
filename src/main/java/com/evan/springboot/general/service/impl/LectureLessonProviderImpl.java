package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.LectureLessonModel;
import com.evan.springboot.general.mapper.LectureLessonDao;
import com.evan.springboot.general.service.LectureLessonProvider;
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
public class LectureLessonProviderImpl extends ServiceImpl<LectureLessonDao, LectureLessonModel> implements LectureLessonProvider {

}
