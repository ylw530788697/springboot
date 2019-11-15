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
@TableName("okya_order")
@ApiModel(value="OrderModel对象", description="")
public class OrderModel extends Model<OrderModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单唯一标识")
    private String orderUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识")
    private Integer isDelete;

    @ApiModelProperty(value = "订单编号")
    private String orderCode;

    @ApiModelProperty(value = "支付渠道的订单编号")
    private String transactionId;

    @ApiModelProperty(value = "用户唯一标识外键")
    private String userUnique;

    @ApiModelProperty(value = "订单商品类型, 1核心课 / 2成长频道")
    private Integer itemType;

    @ApiModelProperty(value = "订单商品唯一标识外键")
    private String itemUnique;

    @ApiModelProperty(value = "订单商品名称")
    private String itemTitle;

    @ApiModelProperty(value = "订单封面链接")
    private String itemCover;

    @ApiModelProperty(value = "订单商品原价, 单位为分")
    private Integer originalPrice;

    @ApiModelProperty(value = "订单商品现价, 单位为分")
    private Integer currentPrice;

    @ApiModelProperty(value = "订单最终实价, 单位为分")
    private Integer cost;

    @ApiModelProperty(value = "订单商品是否含实物标识 0没有实物 1有实物")
    private Integer haveMaterial;

    @ApiModelProperty(value = "收件人姓名")
    private String receiverName;

    @ApiModelProperty(value = "收件人手机号码")
    private String receiverPhone;

    @ApiModelProperty(value = "收件人地址")
    private String receiverAddress;

    @ApiModelProperty(value = "物流单号")
    private String tradeId;

    @ApiModelProperty(value = "支付方式, 1微信 / 2支付宝 / 3ApplePay")
    private Integer payWay;

    @ApiModelProperty(value = "支付时间")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "订单状态, 0未支付 / 1已支付 / 2已发货 / 3已完成 / 4申请退款 / 5退款中 / 6已退款 / 7已失效")
    private Integer state;

    @ApiModelProperty(value = "课包id")
    private String packageId;

    @ApiModelProperty(value = "苹果对应的购买id")
    private String appId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
