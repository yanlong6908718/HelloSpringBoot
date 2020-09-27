package com.makotojava.learn.hellospringboot.common;

import java.io.Serializable;
import java.util.List;

public class PageTabResponse<T> implements Serializable {
    private static final long serialVersionUID=620421858510718076L;

    private Integer recordsTotal;
    private List<T> data;

    public PageTabResponse() {
    }

    public Integer getRecordsTotal() {
        return this.recordsTotal;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setRecordsTotal(Integer recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PageTabResponse)) return false;
        final PageTabResponse<?> other = (PageTabResponse<?>) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$recordsTotal = this.recordsTotal;
        final Object other$recordsTotal = other.recordsTotal;
        if (this$recordsTotal == null ? other$recordsTotal != null : !this$recordsTotal.equals(other$recordsTotal))
            return false;
        final Object this$data = this.data;
        final Object other$data = other.data;
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PageTabResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $recordsTotal = this.recordsTotal;
        result = result * PRIME + ($recordsTotal == null ? 43 : $recordsTotal.hashCode());
        final Object $data = this.data;
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "PageTabResponse(recordsTotal=" + this.recordsTotal + ", data=" + this.data + ")";
    }
}
