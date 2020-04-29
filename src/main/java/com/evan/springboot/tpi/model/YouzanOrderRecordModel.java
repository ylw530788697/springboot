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
@TableName("youzan_order_record")
@ApiModel(value="YouzanOrderRecordModel对象", description="")
public class YouzanOrderRecordModel extends Model<YouzanOrderRecordModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "有赞订单业务主键（系统生成）")
    private String mu;

    @ApiModelProperty(value = "有赞商品标题")
    private String title;

    @ApiModelProperty(value = "用户手机号码")
    private String phone;

    @ApiModelProperty(value = "有赞商品id号")
    private String youzanGoodsId;

    @ApiModelProperty(value = "发放有赞购买课程状态 0未发放 1已发放")
    private Integer releaseState;

    @ApiModelProperty(value = "支付时间")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    private Integer version;

    @ApiModelProperty(value = "有赞订单号")
    private String youzanOrderId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
