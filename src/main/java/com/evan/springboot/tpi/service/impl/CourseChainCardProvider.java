package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseChainCardModel;
import com.evan.springboot.tpi.mapper.CourseChainCardDao;
import com.evan.springboot.tpi.service.ICourseChainCardProvider;
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
public class CourseChainCardProvider extends ServiceImpl<CourseChainCardDao, CourseChainCardModel> implements ICourseChainCardProvider {

}
