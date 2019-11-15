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
@TableName("okya_course_click_card")
@ApiModel(value="CourseClickCardModel对象", description="")
public class CourseClickCardModel extends Model<CourseClickCardModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "核心课程连接法卡片唯一标识")
    private String clickCardUnique;

    @ApiModelProperty(value = "核心课程课时唯一标识外键")
    private String lessonUnique;

    @ApiModelProperty(value = "核心课程连接法节点唯一标识")
    private String clickNodeUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识 0未删除 1删除")
    private Integer isDelete;

    @ApiModelProperty(value = "背景图")
    private String imageUrl;

    @ApiModelProperty(value = "出现次数")
    private Integer times;

    @ApiModelProperty(value = "卡片类型 1可点项 2干扰项")
    private Integer cardType;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
