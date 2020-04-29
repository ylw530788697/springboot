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
@TableName("okya_sales")
@ApiModel(value="SalesModel对象", description="")
public class SalesModel extends Model<SalesModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String mUnique;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    private Integer version;

    @ApiModelProperty(value = "大区")
    private String area;

    @ApiModelProperty(value = "地区")
    private String region;

    @ApiModelProperty(value = "中心名称")
    private String centerName;

    @ApiModelProperty(value = "员工姓名")
    private String employeeName;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "销售码")
    private String salesCode;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
