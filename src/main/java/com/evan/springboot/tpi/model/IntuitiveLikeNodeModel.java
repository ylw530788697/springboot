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
@TableName("okya_intuitive_like_node")
@ApiModel(value="IntuitiveLikeNodeModel对象", description="")
public class IntuitiveLikeNodeModel extends Model<IntuitiveLikeNodeModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "直观像节点主键id")
    private String mu;

    @ApiModelProperty(value = "问题展示时间")
    private Integer answerShowTime;

    @ApiModelProperty(value = "直观像模式选择 4：四格 5：五格 6： 六格 10：十格")
    private Integer intuitiveType;

    @ApiModelProperty(value = "背景图片")
    private String backgroundUnique;

    @ApiModelProperty(value = "展示环节开始音频 ")
    private String showBeginUrl;

    @ApiModelProperty(value = "展示环节结束音频 ")
    private String showEndUrl;

    @ApiModelProperty(value = "答题开始音频 ")
    private String answerBeginUrl;

    @ApiModelProperty(value = "答题结束音频 ")
    private String answerEndUrl;

    @ApiModelProperty(value = "直观像预览展示时间")
    private Integer intuitivePreviewTime;

    @ApiModelProperty(value = "直观像展示时间")
    private Integer intuitiveShowTime;

    @ApiModelProperty(value = "允许答题时间")
    private Integer answerTime;

    @ApiModelProperty(value = "答案判定时间")
    private Integer answerJudgeTime;

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
