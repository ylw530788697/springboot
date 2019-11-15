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
@TableName("okya_course_question")
@ApiModel(value="CourseQuestionModel对象", description="")
public class CourseQuestionModel extends Model<CourseQuestionModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "核心课程问题唯一标识")
    private String questionUnique;

    @ApiModelProperty(value = "核心课程课时唯一标识外键")
    private String lessonUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识")
    private Integer isDelete;

    @ApiModelProperty(value = "核心课程问题")
    private String question;

    @ApiModelProperty(value = "核心课程问题语音链接")
    private String audioUrl;

    @ApiModelProperty(value = "核心课程问题展示时间")
    private Integer showTime;

    @ApiModelProperty(value = "核心课程问题节点唯一标识")
    private String questionNodeUnique;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
