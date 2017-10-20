package top.moverco.mtaxiforpassenger.common.http.impl;

import top.moverco.mtaxiforpassenger.common.http.IResponse;

/**
 * Created by Moverco.
 */

public class BaseResponse implements IResponse {
    public static final int STATE_OK = 200;
    public static final int STATE_ERROR = -1;
    private int code;
    private String content;
    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getContent() {
        return content;
    }

    public void setCode(int code) {
    }

    public void setData(String body) {
    }
}
