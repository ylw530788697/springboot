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
@TableName("okya_banner")
@ApiModel(value="BannerModel对象", description="")
public class BannerModel extends Model<BannerModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String bannerUnique;

    @ApiModelProperty(value = "Banner管理模式 0跳转长图 1运用内跳转")
    private Integer bannerType;

    @ApiModelProperty(value = "顺序")
    private Integer sequence;

    @ApiModelProperty(value = "Banner图片链接")
    private String bannerUrl;

    @ApiModelProperty(value = "Banner模式是运用内跳转0 未选择 1核心课程 2成长频道 跳转长图则为空")
    private Integer itemType;

    @ApiModelProperty(value = "Banner模式是运用内跳转：对应详情长图链接 运用内跳转：对应专辑id")
    private String itemContent;

    @ApiModelProperty(value = "是否上架标识0 未上架 1已上架")
    private Integer isPublish;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
