package com.general.model;

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
 * 兑换码包
 * </p>
 *
 * @author EvanYang
 * @since 2019-11-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_marketing_code_package")
@ApiModel(value="MarketingCodePackageModel对象", description="兑换码包")
public class MarketingCodePackageModel extends Model<MarketingCodePackageModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "逻辑主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "兑换码包id")
    private String codePackageId;

    @ApiModelProperty(value = "兑换码包名称")
    private String codePackageName;

    @ApiModelProperty(value = "兑换类型，1 核心课， 2 成长频道课")
    private Integer exchangeType;

    @ApiModelProperty(value = "兑换课程id")
    private String courseId;

    @ApiModelProperty(value = "兑换课程名称")
    private String courseTitle;

    @ApiModelProperty(value = "兑换课程总共课时")
    private Integer exchangeAllLessonCount;

    @ApiModelProperty(value = "兑换课程课时")
    private Integer exchangeLessonCount;

    @ApiModelProperty(value = "发送渠道,10天猫、11京东 12淘宝、13有赞、14公众号、15七田真、16微商、17优选、18其他")
    private Integer sendChannel;

    @ApiModelProperty(value = "发放数量")
    private Integer sendCount;

    @ApiModelProperty(value = "已兑换数量")
    private Integer useCount;

    @ApiModelProperty(value = "生效时间")
    private Long startTime;

    @ApiModelProperty(value = "过期时间")
    private Long expireTime;

    @ApiModelProperty(value = "创建人")
    private String adminName;

    @ApiModelProperty(value = "兑换码包状态，默认1未开始，2进行中，3已过期，4已停用")
    private Integer codePackageState;

    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    @ApiModelProperty(value = "伪删除 0是没有删除 1是删除")
    private Integer disabled;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
