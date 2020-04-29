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
@TableName("tpi_user_get_record")
@ApiModel(value="TpiUserGetRecordModel对象", description="")
public class TpiUserGetRecordModel extends Model<TpiUserGetRecordModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String mUnique;

    @ApiModelProperty(value = "可用时长单位是天")
    private Integer availableDays;

    @ApiModelProperty(value = "用户外键")
    private String userId;

    @ApiModelProperty(value = "会员类型 0普通vip 1赠送vip 2有赞赠送")
    private Integer vipType;

    @ApiModelProperty(value = "订单唯一标识")
    private String orderId;

    @ApiModelProperty(value = "vip的id")
    private String vipManageId;

    @ApiModelProperty(value = "vip过期时间")
    private Long expireTime;

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
