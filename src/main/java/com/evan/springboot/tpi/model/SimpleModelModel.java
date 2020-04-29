package com.evan.springboot.tpi.model;

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
 * 
 * </p>
 *
 * @author EvanYang
 * @since 2020-04-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("okya_simple_model")
@ApiModel(value="SimpleModelModel对象", description="")
public class SimpleModelModel extends Model<SimpleModelModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String simpleId;

    @ApiModelProperty(value = "对象类型")
    private String simpleType;

    @ApiModelProperty(value = "对象名称")
    private String simpleName;

    @ApiModelProperty(value = "伪删除 -1为删除")
    private Integer disabled;

    @ApiModelProperty(value = "创建时间")
    private Long createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
