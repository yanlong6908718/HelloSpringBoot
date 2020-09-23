package com.makotojava.learn.hellospringboot.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value="基础返回类",description="基础返回类")
public class ResultDto<T> implements Serializable {
    private  static final long serialVersionUID=7472879865471412372L;

    @ApiModelProperty(value="返回结果码 1 成功 0 失败" ,required=true,example="1",allowableValues = "1,0")
    private Integer resultCode;
    @ApiModelProperty(value="提示信息" ,required=true,example="成功",allowableValues = "成功,失败")
    private String message="";
    @ApiModelProperty(value="响应结果")
    private T data=null;

    public Integer getResultCode(){
        return resultCode;
    }
    public static ResultDto newInstance(){
        return new ResultDto();
    }

    /***
     * 设置为成功状态
     * */
    public void setAsSuccess(){
        this.resultCode=1;
    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public static ResultDto success(String message){
        ResultDto resultDto =new ResultDto();
        resultDto.setAsSuccess();
        resultDto.setMessage(message);
        return resultDto;
    }
    public static <T> ResultDto<T> success(String message,T data){
        ResultDto<T> resultDto=new ResultDto<>();
        resultDto.setAsSuccess();
        resultDto.setMessage(message);
        resultDto.setData(data);
        return resultDto;
    }

    /*
    * 设置失败状态
    * */
    public void setAsFailure(){
        this.resultCode=0;
    }

    public static <T> ResultDto<T> fail(String message){
        ResultDto<T> resultDto=new ResultDto<>();
        resultDto.setAsFailure();
        resultDto.setMessage(message);
        return resultDto;
    }

    public static <T> ResultDto<T> fail(String message,T data){
        ResultDto<T> resultDto =new ResultDto<>();
        resultDto.setAsFailure();
        resultDto.setData(data);
        return resultDto;
    }

    private void setData(T data) {
        this.data=data;
    }
    public T getData(){
        return data;
    }

}
