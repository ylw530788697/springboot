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
@TableName("music_menu_r_title")
@ApiModel(value="MusicMenuRTitleModel对象", description="")
public class MusicMenuRTitleModel extends Model<MusicMenuRTitleModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "旧标题")
    private String oldTitle;

    @ApiModelProperty(value = "新标题")
    private String newTitle;

    @ApiModelProperty(value = "新专辑id")
    private String newAlbumId;

    @ApiModelProperty(value = "是否执行导入，0未执行，1已执行")
    private String isExecute;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
