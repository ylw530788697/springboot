package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.CoursePackageDetailModel;
import com.evan.springboot.general.mapper.CoursePackageDetailDao;
import com.evan.springboot.general.service.CoursePackageDetailProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课包详情 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2019-11-15
 */
@Service
public class CoursePackageDetailProviderImpl extends ServiceImpl<CoursePackageDetailDao, CoursePackageDetailModel> implements CoursePackageDetailProvider {

}
