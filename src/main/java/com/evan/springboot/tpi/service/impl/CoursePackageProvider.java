package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CoursePackageModel;
import com.evan.springboot.tpi.mapper.CoursePackageDao;
import com.evan.springboot.tpi.service.ICoursePackageProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课包 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Service
public class CoursePackageProvider extends ServiceImpl<CoursePackageDao, CoursePackageModel> implements ICoursePackageProvider {

}
