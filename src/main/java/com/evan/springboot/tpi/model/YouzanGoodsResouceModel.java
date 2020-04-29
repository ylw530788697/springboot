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
@TableName("youzan_goods_resouce")
@ApiModel(value="YouzanGoodsResouceModel对象", description="")
public class YouzanGoodsResouceModel extends Model<YouzanGoodsResouceModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "有赞商品资源主键id")
    private String mu;

    @ApiModelProperty(value = "有赞商品id号")
    private String youzanGoodsId;

    @ApiModelProperty(value = "有赞商品标题")
    private String title;

    @ApiModelProperty(value = "okya标题")
    private String okyaTitle;

    @ApiModelProperty(value = "商品类型, 1Okya核心课 /2 Okya成长频道/3七田真vip")
    private Integer itemType;

    @ApiModelProperty(value = "商品唯一标识外键")
    private String itemId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    private Integer version;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
