package top.moverco.mtaxiforpassenger.common.http.impl;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import top.moverco.mtaxiforpassenger.common.config.Api;
import top.moverco.mtaxiforpassenger.common.http.IRequest;

/**
 * Created by Moverco.
 */

public class BaseRequestImpl implements IRequest {
    private String url;
    private String method = POST;
    private Map<String,String> header;
    private Map<String,Object> body;
    private static final String APPLICATION_ID = "X-Bmob-Application-Id";
    private static final String REST_API_KEY = "X-Bmob-REST-API-Key";

    public BaseRequestImpl(String url){
        this.url = url;
        header  = new HashMap<>();
        body = new HashMap<>();
        header.put(APPLICATION_ID, Api.Config.getAppId());
        header.put(REST_API_KEY,Api.Config.getApiKey());
    }
    @Override
    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public void setHeader(String key, String value) {
        header.put(key,value);
    }

    @Override
    public void setBody(String key, String value) {
        body.put(key,value);
    }

    @Override
    public String getUrl() {
        if (GET.equals(method)){
            for (String key:body.keySet()){
                url = url.replace("${"+key+"}",body.get(key).toString());
            }
        }
        return url;
    }

    @Override
    public Map<String, String> getHeader() {
        return header;
    }

    @Override
    public Object getBody() {
        if (body!=null){
            return new Gson().toJson(body,HashMap.class);
        }
        return "{}";
    }
}
