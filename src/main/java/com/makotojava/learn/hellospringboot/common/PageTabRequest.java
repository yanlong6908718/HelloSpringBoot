package com.makotojava.learn.hellospringboot.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
@ApiModel(value="分页请求参数",description = "请求参数类")
public class PageTabRequest<Dto extends BaseDto> implements Serializable {
    private static final long serialVersionUID=7328071045193618567L;

    @ApiModelProperty(value="页码",required = true ,example="1")
    private Integer pageNum=1;
    @ApiModelProperty(value="每页数据量",required = true ,example="10")
    private Integer pageSize=10;
    @ApiModelProperty(value="特定查询参数",required = true ,example="status=1")
    private Dto params;
}
