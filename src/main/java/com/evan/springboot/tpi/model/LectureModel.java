package com.evan.springboot.tpi.model;

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
 * @since 2020-04-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_lecture")
@ApiModel(value="LectureModel对象", description="")
public class LectureModel extends Model<LectureModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "成长频道专辑唯一标识")
    private String lectureUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime modifyDate;

    @ApiModelProperty(value = "是否删除标识")
    private Integer isDelete;

    @ApiModelProperty(value = "成长频道专辑标题")
    private String title;

    @ApiModelProperty(value = "成长频道专辑封面链接")
    private String coverUrl;

    @ApiModelProperty(value = "成长频道专辑详情链接")
    private String detailUrl;

    @ApiModelProperty(value = "成长频道专辑原价")
    private Integer originalPrice;

    @ApiModelProperty(value = "成长频道专辑现价")
    private Integer currentPrice;

    @ApiModelProperty(value = "成长频道专辑已有课时数")
    private Integer nowLessonCount;

    @ApiModelProperty(value = "成长频道专辑总课时数")
    private Integer allLessonCount;

    @ApiModelProperty(value = "排序号, 正序")
    private Integer sequence;

    @ApiModelProperty(value = "是否发布标识0未发布 1已发布")
    private Integer isPublish;

    @ApiModelProperty(value = "是否免费标识 0不免费 1 免费")
    private Integer isFree;

    @ApiModelProperty(value = "更新时间, 新增课时后修改")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "苹果支付id(okyaApp上购买)")
    private String appId;

    @ApiModelProperty(value = "苹果手机购买id (七田真App上购买)")
    private String tpiAppId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
