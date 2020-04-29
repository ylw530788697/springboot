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
@TableName("tpi_search_keyword_statistics")
@ApiModel(value="TpiSearchKeywordStatisticsModel对象", description="")
public class TpiSearchKeywordStatisticsModel extends Model<TpiSearchKeywordStatisticsModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "业务主键")
    private String mUnique;

    @ApiModelProperty(value = "搜索关键字")
    private String keyword;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty(value = "是否删除 0表示不删除，1表示是删除")
    private Integer isDelete;

    private Integer version;

    @ApiModelProperty(value = "搜索次数")
    private Integer searchCount;

    @ApiModelProperty(value = "搜索的内容的类型，0未确定类型，1歌单，2视频集合，3歌曲")
    private Integer itemType;

    @ApiModelProperty(value = "搜索的内容对应的内容的id")
    private String itemId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
