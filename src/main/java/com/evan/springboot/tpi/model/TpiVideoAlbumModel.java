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
@TableName("tpi_video_album")
@ApiModel(value="TpiVideoAlbumModel对象", description="")
public class TpiVideoAlbumModel extends Model<TpiVideoAlbumModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String mUnique;

    @ApiModelProperty(value = "歌单封面图片链接")
    private String coverUrl;

    @ApiModelProperty(value = "歌单标题")
    private String title;

    @ApiModelProperty(value = "价格, 单位为分")
    private Integer price;

    @ApiModelProperty(value = "顺序")
    private Integer sequence;

    @ApiModelProperty(value = "是线下会员吗？0表示不是，1表示是")
    private Integer vipState;

    @ApiModelProperty(value = "是否登录可见：【是否需要登录】选是才出现【是否为VIP内容】登录状态0不需要登录 1需要等领域")
    private Integer loginState;

    @ApiModelProperty(value = "上下架状态 0未上架 1已上架")
    private Integer publishState;

    @ApiModelProperty(value = "专辑描述")
    private String description;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    private Integer version;

    @ApiModelProperty(value = "所属分类id")
    private String categoryId;

    @ApiModelProperty(value = "视频数量")
    private Integer videoCount;

    @ApiModelProperty(value = "热度级别，0普通，1被推荐")
    private Integer heatLevel;

    @ApiModelProperty(value = "副标题")
    private String subTitle;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
