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
@TableName("okya_lecture_lesson")
@ApiModel(value="LectureLessonModel对象", description="")
public class LectureLessonModel extends Model<LectureLessonModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "成长频道课程课时唯一标识")
    private String lessonUnique;

    @ApiModelProperty(value = "成长频道课程唯一标识外键")
    private String lectureUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识")
    private Integer isDelete;

    @ApiModelProperty(value = "成长频道课程课时标题")
    private String title;

    @ApiModelProperty(value = "成长频道课程课时描述")
    private String description;

    @ApiModelProperty(value = "成长频道课程课时封面链接")
    private String coverUrl;

    @ApiModelProperty(value = "成长频道课程课时多媒体链接")
    private String mediumUrl;

    @ApiModelProperty(value = "成长频道课程课时多媒体类型, 1视频 / 2音频")
    private Integer mediumType;

    @ApiModelProperty(value = "成长频道课程课时排序号, 正序")
    private Integer sequence;

    @ApiModelProperty(value = "是否可免费体验标识 0收费 1免费")
    private Integer canExperience;

    @ApiModelProperty(value = "是否上架标识0 未上架 1已上架")
    private Integer isPublish;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
