package com.evan.springboot.tpi.service.impl;

import com.evan.springboot.tpi.model.InviteCouponModel;
import com.evan.springboot.tpi.mapper.InviteCouponDao;
import com.evan.springboot.tpi.service.IInviteCouponProvider;
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
public class InviteCouponProvider extends ServiceImpl<InviteCouponDao, InviteCouponModel> implements IInviteCouponProvider {

}
