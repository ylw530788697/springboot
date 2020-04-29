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
@TableName("tpi_video_detail")
@ApiModel(value="TpiVideoDetailModel对象", description="")
public class TpiVideoDetailModel extends Model<TpiVideoDetailModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String mUnique;

    @ApiModelProperty(value = "视频专辑外键")
    private String albumId;

    @ApiModelProperty(value = "视频链接")
    private String videoUrl;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "顺序")
    private Integer sequence;

    @ApiModelProperty(value = "上下架状态 0未上架 1已上架")
    private Integer publishState;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    private Integer version;

    @ApiModelProperty(value = "体验状态，0不可体验，1可体验")
    private Integer experienceState;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
