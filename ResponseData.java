package OrderDataToJson;

public class ResponseData<T> {
    private T data;
    private Integer code;
    private String msg;

    public ResponseData(T data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
    public ResponseData(){}

    @Override
    public String toString() {
        return "ResponseData{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
