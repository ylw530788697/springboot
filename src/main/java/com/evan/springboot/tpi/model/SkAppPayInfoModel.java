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
@TableName("sk_app_pay_info")
@ApiModel(value="SkAppPayInfoModel对象", description="")
public class SkAppPayInfoModel extends Model<SkAppPayInfoModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "交易时间")
    private LocalDateTime addtime;

    @ApiModelProperty(value = "订单号")
    private String outTradeNo;

    @ApiModelProperty(value = "支付客户端")
    private String sourceType;

    @ApiModelProperty(value = "交易状态")
    private String statues;

    @ApiModelProperty(value = "付款人手机号")
    private String mobile;

    @ApiModelProperty(value = "商品名称")
    private String title;

    @ApiModelProperty(value = "商品类型")
    private String type;

    @ApiModelProperty(value = "订单金额")
    private String orderMoney;

    @ApiModelProperty(value = "退款金额")
    private String backMoney;

    @ApiModelProperty(value = "实际金额")
    private String actualMoney;

    @ApiModelProperty(value = "原id")
    private Integer oldId;

    @ApiModelProperty(value = "本平台userid")
    private Integer userid;

    @ApiModelProperty(value = "微信退款id")
    private String prepayId;

    @ApiModelProperty(value = "特殊标记")
    private String mark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
