package com.general.model;

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
 * @since 2019-11-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_order_refund")
@ApiModel(value="OrderRefundModel对象", description="")
public class OrderRefundModel extends Model<OrderRefundModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单退款记录唯一标识")
    private String refundUnique;

    @ApiModelProperty(value = "订单唯一标识外键")
    private String orderUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识")
    private Integer isDelete;

    @ApiModelProperty(value = "申请退款原因")
    private String reason;

    @ApiModelProperty(value = "客服反馈")
    private String feedback;

    @ApiModelProperty(value = "退款金额, 单位为分")
    private Integer refundMoney;

    @ApiModelProperty(value = "订单退款状态,  1申请退款 / 2退款中 / 3已退款 / 4不退款")
    private Integer state;

    @ApiModelProperty(value = "管理用户姓名")
    private String adminName;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
