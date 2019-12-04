package com.evan.springboot.general.mapper;

import com.evan.springboot.general.model.UserModel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import javax.management.Query;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author EvanYang
 * @since 2019-11-15
 */
public interface UserDao extends BaseMapper<UserModel> {
    void quererDemo();
}
