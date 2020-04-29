package com.evan.springboot.tpi.model;

import java.math.BigDecimal;
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
@TableName("sk_app_play_order")
@ApiModel(value="SkAppPlayOrderModel对象", description="")
public class SkAppPlayOrderModel extends Model<SkAppPlayOrderModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userid;

    private String openid;

    private BigDecimal totalFee;

    private Integer playId;

    @ApiModelProperty(value = "1是iOS，2是Android，3是小程序,5是线下购买产品送歌单，6是线上购买产品兑换歌单")
    private Integer sourceType;

    @ApiModelProperty(value = "订单号")
    private String outTradeNo;

    private LocalDateTime timeEnd;

    private LocalDateTime addtime;

    @ApiModelProperty(value = "特殊情况或者人工处理购买备注，不是人工默认为空")
    private String addInfo;

    @ApiModelProperty(value = "0为上一版本,默认为1为新版本的购买的状态，在2.2之前的购买都可以退款为0,兑换获得记录为2")
    private Integer recordStatus;

    @ApiModelProperty(value = "1为拼团中歌单")
    private String isGroup;

    @ApiModelProperty(value = "订单返回标识")
    private String prepayId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
