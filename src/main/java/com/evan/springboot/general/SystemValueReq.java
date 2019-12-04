package com.evan.springboot.general;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @author evanYang
 * @version 1.0
 * @date 11/23/2019 16:43
 */
@Data
@ApiModel(value = "公共请求")
public class SystemValueReq implements Serializable {
    private static final long serialVersionUID = -7946835635619207635L;
    private String variableKey;
}
