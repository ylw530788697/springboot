package com.evan.springboot.tpi.model;

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
 * 课包详情
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_course_package_detail")
@ApiModel(value="CoursePackageDetailModel对象", description="课包详情")
public class CoursePackageDetailModel extends Model<CoursePackageDetailModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "逻辑主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "课包详情关联id")
    private String coursePackageDetailId;

    @ApiModelProperty(value = "课包类型 1兑换码创建 2后台创建")
    private Integer packageType;

    @ApiModelProperty(value = "兑换码课包或者课程课包")
    private String packageId;

    @ApiModelProperty(value = "兑换类型，核心课，成长频道课")
    private Integer exchangeType;

    @ApiModelProperty(value = "课程id")
    private String courseId;

    @ApiModelProperty(value = "核心课程名称")
    private String courseTitle;

    @ApiModelProperty(value = "课程分类id")
    private String categoryId;

    @ApiModelProperty(value = "兑换课程分类名称")
    private String categoryTitle;

    @ApiModelProperty(value = "课程课时id")
    private String packageLessonId;

    @ApiModelProperty(value = "课时状态 0 未制作完成 1已制作完成可以观看")
    private Integer lessonCreateState;

    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    @ApiModelProperty(value = "伪删除 0是没有删除 1是删除")
    private Integer disabled;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
