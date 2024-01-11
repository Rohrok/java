package shinyonggun.ch5.test;

public enum Status {
    STORE_OPEN("가게 문 열림", "A100"),
    STORE_CLOSED("가게 문 닫음", "B200");

    private final String status;
    private final String code;

    Status(String status, String code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }
}
