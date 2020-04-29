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
@TableName("tpi_ios_receipts")
@ApiModel(value="TpiIosReceiptsModel对象", description="")
public class TpiIosReceiptsModel extends Model<TpiIosReceiptsModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String mUnique;

    @ApiModelProperty(value = "订单id")
    private String orderId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "用户凭据")
    private String receiptData;

    @ApiModelProperty(value = "用户凭据状态 0失败 1成功")
    private Integer receiptState;

    @ApiModelProperty(value = "用户凭据类型 0okya 1七田真")
    private Integer receiptType;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    @ApiModelProperty(value = "版本号")
    private Integer version;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
