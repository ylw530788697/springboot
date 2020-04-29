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
 * 兑换码
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_marketing_code")
@ApiModel(value="MarketingCodeModel对象", description="兑换码")
public class MarketingCodeModel extends Model<MarketingCodeModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "兑换码id")
    private String codeId;

    @ApiModelProperty(value = "兑换码")
    private String codeName;

    @ApiModelProperty(value = "兑换码包id")
    private String codePackageId;

    @ApiModelProperty(value = "兑换码状态，默认为1未兑换,2已兑换3已停用")
    private Integer codeState;

    @ApiModelProperty(value = "生效时间")
    private Long startTime;

    @ApiModelProperty(value = "过期时间")
    private Long expireTime;

    @ApiModelProperty(value = "兑换用户")
    private String userId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "伪删除 0是没有删除 1是删除")
    private Integer disabled;

    @ApiModelProperty(value = "发放渠道，1天猫，2京东")
    private Integer sendChannel;

    @ApiModelProperty(value = "兑换码兑换时间")
    private Long exchangeTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
