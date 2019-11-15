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
@TableName("okya_course_chain_card")
@ApiModel(value="CourseChainCardModel对象", description="")
public class CourseChainCardModel extends Model<CourseChainCardModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "核心课程连接法卡片唯一标识")
    private String chainCardUnique;

    @ApiModelProperty(value = "核心课程课时唯一标识外键")
    private String lessonUnique;

    @ApiModelProperty(value = "核心课程连接法节点唯一标识")
    private String chainNodeUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识 0未删除 1删除")
    private Integer isDelete;

    @ApiModelProperty(value = "提示音频链接")
    private String tipsMusicUrl;

    @ApiModelProperty(value = "卡片进入音频链接")
    private String startMusicUrl;

    @ApiModelProperty(value = "卡片图片链接")
    private String cardImageUrl;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
