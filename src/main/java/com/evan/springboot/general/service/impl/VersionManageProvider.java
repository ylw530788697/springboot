package com.evan.springboot.general.service.impl;

import com.evan.springboot.general.model.VersionManageModel;
import com.evan.springboot.general.mapper.VersionManageDao;
import com.evan.springboot.general.service.IVersionManageProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 版本管理表 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-01-04
 */
@Service
public class VersionManageProvider extends ServiceImpl<VersionManageDao, VersionManageModel> implements IVersionManageProvider {

}
