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
 * 
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_user")
@ApiModel(value="UserModel对象", description="")
public class UserModel extends Model<UserModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String userUnique;

    @ApiModelProperty(value = "微信用户标识")
    private String openId;

    @ApiModelProperty(value = "微信开放平台唯一标识")
    private String unionId;

    private String tpiOpenId;

    private String tpiUnionId;

    @ApiModelProperty(value = "用户手机号码")
    private String phone;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "用户头像链接")
    private String profilePhoto;

    @ApiModelProperty(value = "用户姓名")
    private String name;

    @ApiModelProperty(value = "用户生日")
    private LocalDate birthday;

    @ApiModelProperty(value = "用户性别")
    private Integer sex;

    @ApiModelProperty(value = "用户角色, 爸爸 / 妈妈")
    private String role;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区")
    private String district;

    @ApiModelProperty(value = "用户地址")
    private String address;

    @ApiModelProperty(value = "注册时间")
    private LocalDateTime registerDate;

    @ApiModelProperty(value = "最后一次登录时间")
    private LocalDateTime lastLoginDate;

    @ApiModelProperty(value = "用户类型：0 okya用户，1七田真老用户 ，2七田真新用户")
    private Integer isVip;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
