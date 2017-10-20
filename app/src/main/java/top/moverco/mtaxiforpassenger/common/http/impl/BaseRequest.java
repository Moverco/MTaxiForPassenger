package top.moverco.mtaxiforpassenger.common.http.impl;

import java.util.HashMap;
import java.util.Map;

import top.moverco.mtaxiforpassenger.common.http.IRequest;

import static android.view.View.X;

/**
 * Created by Moverco.
 */

public class BaseRequest implements IRequest {
    private String url;
    private String method = POST;
    private Map<String,String> header;
    private Map<String,Object> body;
    private static final String APPLICATION_ID = "X-Bmob-Application-Id";
    private static final String REST_API_KEY = "X-Bmob-REST-API-Key";

    public BaseRequest(String url){
        this.url = url;
        header  = new HashMap<>();
        body = new HashMap<>();
        header.put(APPLICATION_ID,);
        header.put(REST_API_KEY,);
    }
    @Override
    public void setMethod(String method) {

    }

    @Override
    public void setHeader(String key, String value) {

    }

    @Override
    public void setBody(String key, String value) {

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
        return null;
    }

    @Override
    public Object getBody() {
        return null;
    }
}
