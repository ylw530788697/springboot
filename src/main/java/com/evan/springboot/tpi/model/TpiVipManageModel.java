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
@TableName("tpi_vip_manage")
@ApiModel(value="TpiVipManageModel对象", description="")
public class TpiVipManageModel extends Model<TpiVipManageModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String mUnique;

    @ApiModelProperty(value = "可用时长单位是天")
    private Integer availableDays;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "核心课程原价, 单位为分")
    private Integer originalPrice;

    @ApiModelProperty(value = "核心课程现价, 单位为分")
    private Integer currentPrice;

    @ApiModelProperty(value = "会员类型 0普通vip 1赠送vip")
    private Integer vipType;

    @ApiModelProperty(value = "是否七田真会员可见？0表示不是，1表示是")
    private Integer vipState;

    @ApiModelProperty(value = "上下架状态 0未上架 1已上架")
    private Integer publishState;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    private Integer version;

    @ApiModelProperty(value = "用户类型，0新用户，1老用户")
    private Integer userType;

    @ApiModelProperty(value = "苹果购买的id")
    private String appId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
