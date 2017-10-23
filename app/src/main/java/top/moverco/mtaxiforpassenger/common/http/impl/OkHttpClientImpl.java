package top.moverco.mtaxiforpassenger.common.http.impl;

import java.io.IOException;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import top.moverco.mtaxiforpassenger.common.http.IHttpClient;
import top.moverco.mtaxiforpassenger.common.http.IRequest;
import top.moverco.mtaxiforpassenger.common.http.IResponse;

/**
 * Created by Moverco.
 */

public class OkHttpClientImpl implements IHttpClient {
    OkHttpClient mOkHttpClient = new OkHttpClient.Builder().build();

    @Override
    public IResponse get(IRequest request, boolean forceCache) {
        request.setMethod(IRequest.GET);
        Map<String, String> header = request.getHeader();
        Request.Builder builder = new Request.Builder();
        for (String key : header.keySet()) {
            builder.header(key, header.get(key));
        }
        String url = request.getUrl();
        builder.url(url).get();
        Request okRequest = builder.build();
        return execute(okRequest);
    }

    @Override
    public IResponse post(IRequest request, boolean forceCache) {
        request.setMethod(IRequest.POST);
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(mediaType, request.getBody().toString());
        Map<String, String> header = request.getHeader();
        Request.Builder builder = new Request.Builder();
        for (String key : header.keySet()) {

            builder.header(key, header.get(key));

        }
        builder.url(request.getUrl())
                .post(body);
        Request oKRequest = builder.build();
        return execute(oKRequest);
    }

    private IResponse execute(Request request) {
        BaseResponseImpl commonResponse = new BaseResponseImpl();
        try {
            Response response = mOkHttpClient.newCall(request).execute();
            commonResponse.setCode(response.code());
            String body = response.body().string();
            commonResponse.setData(body);
        } catch (IOException e) {
            e.printStackTrace();
            commonResponse.setCode(commonResponse.STATE_ERROR);
            commonResponse.setData(e.getMessage());
        }
        return commonResponse;
    }
}
