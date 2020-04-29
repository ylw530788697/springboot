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
@TableName("okya_order_detail")
@ApiModel(value="OrderDetailModel对象", description="")
public class OrderDetailModel extends Model<OrderDetailModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "逻辑主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单详情id")
    private String orderDetailId;

    @ApiModelProperty(value = "订单id")
    private String orderId;

    @ApiModelProperty(value = "课包类型 1兑换码 2后台分课包 3手动赠送 4有赞购买")
    private Integer packageType;

    @ApiModelProperty(value = "课包id")
    private String packageId;

    @ApiModelProperty(value = "兑换类型，核心课，成长频道课")
    private Integer exchangeType;

    @ApiModelProperty(value = "课程id")
    private String courseId;

    @ApiModelProperty(value = "兑换课程名称")
    private String courseTitle;

    @ApiModelProperty(value = "课程分类id")
    private String categoryId;

    @ApiModelProperty(value = "兑换课程名称")
    private String categoryTitle;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "课程课时id")
    private String lessonId;

    @ApiModelProperty(value = "课时状态 0 未制作完成 1已制作完成可以观看")
    private Integer lessonCreateState;

    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    @ApiModelProperty(value = "伪删除")
    private Integer disabled;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
