package com.evan.springboot.tpi.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("okya_invite_coupon")
@ApiModel(value="InviteCouponModel对象", description="")
public class InviteCouponModel extends Model<InviteCouponModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "是否使用标识 0未使用")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String couponUnique;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private Integer isDelete;

    @ApiModelProperty(value = "用户手机号码")
    private String userPhone;

    @ApiModelProperty(value = "获得优惠价格, 单位为分")
    private Integer couponMoney;

    @ApiModelProperty(value = "是否使用标识 0未使用 1使用")
    private Integer isUse;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
