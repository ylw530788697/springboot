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
@TableName("okya_intuitive_like_background_img")
@ApiModel(value="IntuitiveLikeBackgroundImgModel对象", description="")
public class IntuitiveLikeBackgroundImgModel extends Model<IntuitiveLikeBackgroundImgModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "直观像答案主键id")
    private String mu;

    @ApiModelProperty(value = "直观像节点外键id")
    private String intuitiveLikeUnique;

    @ApiModelProperty(value = "直观像模式选择 4：四格 5：五格 6： 六格 10：十格")
    private Integer intuitiveType;

    @ApiModelProperty(value = "默认状态 0：默认 1;非默认")
    private Integer defaultState;

    @ApiModelProperty(value = "背景图片链接")
    private String backgroundUrl;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    @ApiModelProperty(value = "版本号")
    private Integer version;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
