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
 * 版本管理表
 * </p>
 *
 * @author EvanYang
 * @since 2020-01-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_version_manage")
@ApiModel(value="VersionManageModel对象", description="版本管理表")
public class VersionManageModel extends Model<VersionManageModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "逻辑主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "版本id")
    private String versionId;

    @ApiModelProperty(value = "版本号")
    private String versionNumber;

    @ApiModelProperty(value = "版本描述")
    private String versionDescription;

    @ApiModelProperty(value = "版本类型，1 强更， 2 非强更")
    private Integer versionType;

    @ApiModelProperty(value = "客户端类型，1 Android， 2 ios")
    private Integer clientType;

    @ApiModelProperty(value = "1当前线上版本（最新版本） 2新建 3下线")
    private Integer versionState;

    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    @ApiModelProperty(value = "伪删除 0是没有删除 1是删除")
    private Integer disabled;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
