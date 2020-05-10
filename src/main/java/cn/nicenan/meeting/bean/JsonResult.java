/**
 * FileName: JsonResult
 * Author:   Administrator
 * Date:     2019/7/25 15:07
 * Description: 返回响应类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 * 牛楠楠
 */
package cn.nicenan.meeting.bean;

/**
 * 〈一句话功能简述〉<br>
 * 〈返回响应类〉
 *
 * @author Administrator
 * @create 2019/7/25
 * @since 1.0.0
 */
public class JsonResult<T> {
    private Integer code;

    private String message;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public JsonResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public JsonResult setData(T data) {
        this.data = data;
        return this;
    }

    public JsonResult() {
        this.code = ResultCode.OK.code();
        this.message = ResultCode.OK.message();
        this.data = null;
    }

    public JsonResult(T data) {
        this.code = ResultCode.OK.code();
        this.message = ResultCode.OK.message();
        this.data = data;
    }

    public JsonResult(ResultCode resultCode) {
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = null;
    }

    public JsonResult(ResultCode resultCode, T data) {
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }
}
