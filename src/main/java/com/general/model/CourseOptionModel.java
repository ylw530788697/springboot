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
@TableName("okya_course_option")
@ApiModel(value="CourseOptionModel对象", description="")
public class CourseOptionModel extends Model<CourseOptionModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "核心课程选项唯一标识")
    private String optionUnique;

    @ApiModelProperty(value = "核心课程课时唯一标识外键")
    private String lessonUnique;

    @ApiModelProperty(value = "核心课程问题唯一标识外键")
    private String questionUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识 0未删除 1删除")
    private Integer isDelete;

    @ApiModelProperty(value = "核心课程选项, A-Z")
    private String optionNo;

    @ApiModelProperty(value = "核心课程选项图片链接")
    private String optionUrl;

    @ApiModelProperty(value = "是否正确选项标识 0错误 1正确")
    private Integer isCorrect;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
