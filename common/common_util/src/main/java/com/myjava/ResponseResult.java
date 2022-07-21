package com.myjava;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

import javax.xml.stream.FactoryConfigurationError;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class ResponseResult implements Serializable {
    @ApiModelProperty(value = "是否成功")
    private boolean success;
    @ApiModelProperty(value = "状态码")
    private Integer code;
    @ApiModelProperty(value = "返回消息")
    private String message;
    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<>();

    //私有化构造器
    private ResponseResult() {
    }

    private static ResponseResult createResponseResult() {
        return new ResponseResult();
    }

    public static ResponseResult ok() {
        ResponseResult result = createResponseResult();
        result.setCode(ResultCode.SUCCESS);
        result.setMessage("成功");
        result.setSuccess(true);
        return result;
    }

    public static ResponseResult error() {
        ResponseResult result = createResponseResult();
        result.setCode(ResultCode.ERROR);
        result.setMessage("系统错误");
        result.setSuccess(false);
        return result;
    }

    //链式调用设置值
    public ResponseResult success(boolean success) {
        this.success = success;
        return this;
    }

    public ResponseResult message(String message) {
        this.message = message;
        return this;
    }

    public ResponseResult code(Integer code) {
        this.code = code;
        return this;
    }

    public ResponseResult data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public ResponseResult data(Map<String, Object> map) {
        this.data = map;
        return this;
    }

}
