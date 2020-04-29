package com.evan.springboot.tpi.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员信息表
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sk_app_customer")
@ApiModel(value="SkAppCustomerModel对象", description="会员信息表")
public class SkAppCustomerModel extends Model<SkAppCustomerModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "userid", type = IdType.AUTO)
    private Integer userid;

    @ApiModelProperty(value = "用户星星数目最后更新时间")
    private String starTime;

    @ApiModelProperty(value = "用户星星的数目")
    private Integer star;

    @ApiModelProperty(value = "用户积分")
    private Integer points;

    @ApiModelProperty(value = "连续领星星的天数")
    private Integer starDays;

    @ApiModelProperty(value = "第三方登陆 ID")
    private String thirdid;

    @ApiModelProperty(value = "七田真会员在系统中的帐号 ID")
    private String useridKm;

    @ApiModelProperty(value = "用户的手机号码")
    private String username;

    @ApiModelProperty(value = "微信登录的openid")
    private String openid;

    private String eusername;

    @ApiModelProperty(value = "用户密码")
    private String password;

    private LocalDate predicted;

    @ApiModelProperty(value = "用户状态，0代表准备怀孕，1代表怀孕中，2代表宝宝已出生，3代表以后再填，4代表孕早期,5代表孕中期,6代表孕晚期")
    private Integer mmStatus;

    @ApiModelProperty(value = "用户昵称")
    private String customername;

    @ApiModelProperty(value = "用户地区")
    private String area;

    @ApiModelProperty(value = "用户小名")
    private String smallname;

    @ApiModelProperty(value = "用户性别")
    private Integer sex;

    private String status;

    @ApiModelProperty(value = "宝宝生日")
    private LocalDate birthday;

    private String mtel;

    @ApiModelProperty(value = "用户注册时间")
    private LocalDateTime createtime;

    private LocalDateTime modifytime;

    private LocalDate statustime;

    @ApiModelProperty(value = "用户是否删除")
    private Integer isdel;

    private LocalDate tracktime;

    private String contact;

    @ApiModelProperty(value = "用户头像")
    private String photoname;

    private String schoolid;

    private String schoolname;

    private Integer staffid;

    private Integer isTeacher;

    @ApiModelProperty(value = "默认是 VIP，是否是日本方面资源")
    private Integer isVip;

    @ApiModelProperty(value = "老师积分")
    private Integer integral;

    @ApiModelProperty(value = "用户来源，0表示来自App，1表示来自孕期公众号")
    private Integer source;

    @ApiModelProperty(value = "同一用户在不同平台下的唯一标识（不同用户在不同公众号下的openid是不同的，为了打通账户，所以将smart kids和孕期的公众号在微信开放平台做了绑定，用户在不同公众号会有共同的UnionID）")
    private String unionid;

    @ApiModelProperty(value = "会员，为空则不是会员，有地址则为会员")
    private String courseMember;

    @ApiModelProperty(value = "线下会员的加入时间")
    private LocalDateTime joinTime;

    @ApiModelProperty(value = "是否同步到skim，1已同步")
    private Boolean syncSkim;

    @ApiModelProperty(value = "新的微信appid之前为老用户2017年10月之前注册的，或者是手机注册的默认为1，10月之后微信注册是默认为2")
    private Integer oldUser;

    private Integer coin;

    @ApiModelProperty(value = "小程序openid")
    private String xOpenid;


    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

}
