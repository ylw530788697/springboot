package com.evan.springboot.general.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 课包课时和已上线课时表
 * </p>
 *
 * @author EvanYang
 * @since 2019-11-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_course_lesson_relation")
@ApiModel(value="CourseLessonRelationModel对象", description="课包课时和已上线课时表")
public class CourseLessonRelationModel extends Model<CourseLessonRelationModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "兑换码id")
    private String lessonRelationId;

    @ApiModelProperty(value = "课程id")
    private String courseId;

    @ApiModelProperty(value = "课程分类id")
    private String categoryId;

    @ApiModelProperty(value = "课时系列（对应第几节课）")
    private Integer lessonSort;

    @ApiModelProperty(value = "课时id，课程没有创建时为空")
    private String lessonId;

    @ApiModelProperty(value = "课时状态 0 未制作完成 1已制作完成可以观看")
    private Integer lessonCreateState;

    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    @ApiModelProperty(value = "伪删除0未删除 1已删除")
    private Integer disabled;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
