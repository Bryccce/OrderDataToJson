package OrderDataToJson;

public enum OrderStatusEnum {
    NEW(1000, "waiting for payment"),
    PAID(1001, "waiting for shipment"),
    SENT(1002, "shipped");
    private int code;
    private String msg;

    OrderStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
