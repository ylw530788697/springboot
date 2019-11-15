package com.general.model;

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
 * @since 2019-11-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_course")
@ApiModel(value="CourseModel对象", description="")
public class CourseModel extends Model<CourseModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "核心课程唯一标识")
    private String courseUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识")
    private Integer isDelete;

    @ApiModelProperty(value = "核心课程标题")
    private String title;

    @ApiModelProperty(value = "核心课程封面链接")
    private String coverUrl;

    @ApiModelProperty(value = "核心课程详情链接")
    private String detailUrl;

    @ApiModelProperty(value = "核心课程原价, 单位为分")
    private Integer originalPrice;

    @ApiModelProperty(value = "核心课程现价, 单位为分")
    private Integer currentPrice;

    @ApiModelProperty(value = "核心课程排序号, 正序")
    private Integer sequence;

    @ApiModelProperty(value = "是否有实物商品标识 0没有实物 1有实物")
    private Integer haveMaterial;

    @ApiModelProperty(value = "是否上架标识 0未上架  1已上架")
    private Integer isPublish;

    @ApiModelProperty(value = "更新时间, 新增课时后修改")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "核心课程类别数")
    private Integer categoryCount;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
