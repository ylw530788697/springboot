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
 * 课包
 * </p>
 *
 * @author EvanYang
 * @since 2019-11-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_course_package")
@ApiModel(value="CoursePackageModel对象", description="课包")
public class CoursePackageModel extends Model<CoursePackageModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "逻辑主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "课包id")
    private String coursePackageId;

    @ApiModelProperty(value = "课包id")
    private String coursePackageName;

    @ApiModelProperty(value = "兑换类型，1 核心课， 2 成长频道课")
    private Integer exchangeType;

    @ApiModelProperty(value = "课程id")
    private String courseId;

    @ApiModelProperty(value = "核心课程名称")
    private String courseTitle;

    @ApiModelProperty(value = "核心课程原价, 单位为分")
    private Integer originalPrice;

    @ApiModelProperty(value = "核心课程现价, 单位为分")
    private Integer currentPrice;

    @ApiModelProperty(value = "是否上架标识 0未上架  1已上架")
    private Integer isPublish;

    @ApiModelProperty(value = "是否可免费体验标识 0收费 1免费")
    private Integer isExperience;

    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    @ApiModelProperty(value = "伪删除 0是没有删除 1是删除")
    private Integer disabled;

    @ApiModelProperty(value = "课包来源 0兑换码创建  1后台创建")
    private Integer coursePackageSource;

    @ApiModelProperty(value = "创建人")
    private String adminName;

    @ApiModelProperty(value = "苹果手机购买id")
    private String appId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
