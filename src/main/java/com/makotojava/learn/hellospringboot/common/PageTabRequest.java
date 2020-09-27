package com.makotojava.learn.hellospringboot.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel(value="分页请求参数",description = "请求参数类")
public class PageTabRequest<Dto extends BaseDto> implements Serializable {
    private static final long serialVersionUID=7328071045193618567L;

    @ApiModelProperty(value="页码",required = true ,example="1")
    private Integer pageNum=1;
    @ApiModelProperty(value="每页数据量",required = true ,example="10")
    private Integer pageSize=10;
    @ApiModelProperty(value="特定查询参数",required = true ,example="status=1")
    private Dto params;

    public PageTabRequest() {
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public Dto getParams() {
        return this.params;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setParams(Dto params) {
        this.params = params;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PageTabRequest)) return false;
        final PageTabRequest<?> other = (PageTabRequest<?>) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$pageNum = this.pageNum;
        final Object other$pageNum = other.pageNum;
        if (this$pageNum == null ? other$pageNum != null : !this$pageNum.equals(other$pageNum)) return false;
        final Object this$pageSize = this.pageSize;
        final Object other$pageSize = other.pageSize;
        if (this$pageSize == null ? other$pageSize != null : !this$pageSize.equals(other$pageSize)) return false;
        final Object this$params = this.params;
        final Object other$params = other.params;
        if (this$params == null ? other$params != null : !this$params.equals(other$params)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PageTabRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $pageNum = this.pageNum;
        result = result * PRIME + ($pageNum == null ? 43 : $pageNum.hashCode());
        final Object $pageSize = this.pageSize;
        result = result * PRIME + ($pageSize == null ? 43 : $pageSize.hashCode());
        final Object $params = this.params;
        result = result * PRIME + ($params == null ? 43 : $params.hashCode());
        return result;
    }

    public String toString() {
        return "PageTabRequest(pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", params=" + this.params + ")";
    }
}
