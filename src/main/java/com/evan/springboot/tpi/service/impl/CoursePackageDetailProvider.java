package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CoursePackageDetailModel;
import com.evan.springboot.tpi.mapper.CoursePackageDetailDao;
import com.evan.springboot.tpi.service.ICoursePackageDetailProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课包详情 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Service
public class CoursePackageDetailProvider extends ServiceImpl<CoursePackageDetailDao, CoursePackageDetailModel> implements ICoursePackageDetailProvider {

}
