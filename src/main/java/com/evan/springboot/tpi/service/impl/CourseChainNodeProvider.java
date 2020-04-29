package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.CourseChainNodeModel;
import com.evan.springboot.tpi.mapper.CourseChainNodeDao;
import com.evan.springboot.tpi.service.ICourseChainNodeProvider;
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
public class CourseChainNodeProvider extends ServiceImpl<CourseChainNodeDao, CourseChainNodeModel> implements ICourseChainNodeProvider {

}
