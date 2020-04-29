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
@TableName("tpi_user_resource")
@ApiModel(value="TpiUserResourceModel对象", description="")
public class TpiUserResourceModel extends Model<TpiUserResourceModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String mUnique;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "资源类型，1歌单，2视频专辑，3歌曲")
    private Integer resourceType;

    @ApiModelProperty(value = "对应的资源id")
    private String resourceId;

    @ApiModelProperty(value = "0表示永久有效，1未过期，2已过期")
    private Integer resourceStatus;

    @ApiModelProperty(value = "权益开始时间")
    private Long startTime;

    @ApiModelProperty(value = "权益结束时间")
    private Long endTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    @ApiModelProperty(value = "版本号")
    private Integer version;

    private LocalDateTime createTime;

    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "备注")
    private String comment;

    @ApiModelProperty(value = "手机号码")
    private String mobile;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
