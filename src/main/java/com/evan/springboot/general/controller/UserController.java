package com.evan.springboot.general.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
import com.evan.springboot.general.mapper.OrderDetailDao;
import com.evan.springboot.general.mapper.UserDao;
import com.evan.springboot.general.model.OrderDetailModel;
import com.evan.springboot.general.model.UserModel;
import com.evan.springboot.general.service.UserProvider;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author EvanYang
 * @since 2019-11-15
 */
@RestController
@RequestMapping("/userModel")
@Api(tags = "CourseController",description = "核心课模块")
public class UserController {
    @Autowired
    private UserProvider userProvider;
    @Autowired
    private UserDao userDao;
    @Autowired
    private OrderDetailDao orderDetailDao;

    @GetMapping("/getUser")
    @ApiOperation(value = "核心课程模块-核心课程查询列表", notes = "", httpMethod = "GET")
    public UserModel demo(){
        UserModel byId = userProvider.getById("4560c9c551534ef99e394d31cac80460");
        UpdateChainWrapper<UserModel> update = userProvider.update();
        BaseMapper<UserModel> baseMapper = userProvider.getBaseMapper();
        UserModel userModel = userDao.selectById("4560c9c551534ef99e394d31cac80460");
        QueryWrapper<UserModel> queryWrapper = new QueryWrapper<UserModel>();
        queryWrapper.eq("phone","18575529353");
        queryWrapper.orderByAsc("phone");
        queryWrapper.orderByDesc("id");
        queryWrapper.ge("id",3);
        queryWrapper.like("id","2");
        //userModelQueryWrapper.select("phone","open_id","password");
        //String sqlSelect = userModelQueryWrapper.getSqlSelect();
        UserModel userModel1 = userDao.selectOne(queryWrapper);
        List<Map<String, Object>> maps = userDao.selectMaps(queryWrapper);

        UserModel userUpdate=new UserModel();
        userUpdate.setCity("测测测");
        userUpdate.setUserUnique("7c5bd8da2f6444a885dccd807dcd40e6");
        userDao.updateById(userUpdate);
        System.out.println(userModel);

        List<UserModel> userModels = userDao.selectList(queryWrapper);


        OrderDetailModel orderDetailModel = new OrderDetailModel();
        orderDetailModel.setDisabled(1);
        UpdateWrapper<OrderDetailModel> updateWrapper = new UpdateWrapper<OrderDetailModel>();
        updateWrapper.eq("order_id", "112124");
        orderDetailDao.update(orderDetailModel, updateWrapper);
        return byId;
    }
}

