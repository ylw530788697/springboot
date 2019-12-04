package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.CourseClickCardModel;
import com.evan.springboot.general.mapper.CourseClickCardDao;
import com.evan.springboot.general.service.CourseClickCardProvider;
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
public class CourseClickCardProviderImpl extends ServiceImpl<CourseClickCardDao, CourseClickCardModel> implements CourseClickCardProvider {

}
