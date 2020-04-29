package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.LectureModel;
import com.evan.springboot.tpi.mapper.LectureDao;
import com.evan.springboot.tpi.service.ILectureProvider;
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
public class LectureProvider extends ServiceImpl<LectureDao, LectureModel> implements ILectureProvider {

}
