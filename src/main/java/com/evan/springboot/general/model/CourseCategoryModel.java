package com.evan.springboot.general.model;

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
@TableName("okya_course_category")
@ApiModel(value="CourseCategoryModel对象", description="")
public class CourseCategoryModel extends Model<CourseCategoryModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "核心课类别唯一标识")
    private String categoryUnique;

    @ApiModelProperty(value = "核心课唯一标识外键")
    private String courseUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识")
    private Integer isDelete;

    @ApiModelProperty(value = "核心课类别标题")
    private String title;

    @ApiModelProperty(value = "分类封面链接")
    private String coverUrl;

    @ApiModelProperty(value = "核心课类别已有课时数")
    private Integer nowLessonCount;

    @ApiModelProperty(value = "核心课类别总课时数")
    private Integer allLessonCount;

    @ApiModelProperty(value = "是否上架标识 0未上架  1已上架")
    private Integer isPublish;

    @ApiModelProperty(value = "更新时间, 新增课时后修改")
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
