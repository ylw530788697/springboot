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
@TableName("okya_course_click_node")
@ApiModel(value="CourseClickNodeModel对象", description="")
public class CourseClickNodeModel extends Model<CourseClickNodeModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "核心课程快速点击节点唯一标识")
    private String clickNodeUnique;

    @ApiModelProperty(value = "核心课程课时唯一标识外键")
    private String lessonUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识")
    private Integer isDelete;

    @ApiModelProperty(value = "互动展示时间")
    private Integer showTime;

    @ApiModelProperty(value = "背景音乐链接")
    private String bgmUrl;

    @ApiModelProperty(value = "引导语语链接")
    private String guideUrl;

    @ApiModelProperty(value = "做题用时")
    private Integer exerciseTime;

    @ApiModelProperty(value = "结束语链接")
    private String closingUrl;

    @ApiModelProperty(value = "背景图")
    private String backgroundUrl;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
