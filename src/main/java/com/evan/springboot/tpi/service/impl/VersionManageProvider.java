package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.VersionManageModel;
import com.evan.springboot.tpi.mapper.VersionManageDao;
import com.evan.springboot.tpi.service.IVersionManageProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 版本管理表 服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Service
public class VersionManageProvider extends ServiceImpl<VersionManageDao, VersionManageModel> implements IVersionManageProvider {

}
