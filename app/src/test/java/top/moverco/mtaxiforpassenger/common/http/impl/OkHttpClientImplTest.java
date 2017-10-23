package top.moverco.mtaxiforpassenger.common.http.impl;

import org.junit.Before;
import org.junit.Test;

import top.moverco.mtaxiforpassenger.common.config.Api;
import top.moverco.mtaxiforpassenger.common.http.IHttpClient;
import top.moverco.mtaxiforpassenger.common.http.IRequest;
import top.moverco.mtaxiforpassenger.common.http.IResponse;

/**
 * Created by Moverco.
 */
public class OkHttpClientImplTest {
    IHttpClient mClient;

    @Before
    public void setUp() throws Exception {
        mClient = new OkHttpClientImpl();

    }

    @Test
    public void get() throws Exception {
        String url = Api.Config.getTestDomain() + Api.TEST_GET;
        IRequest request = new BaseRequestImpl(url);
        request.setBody("uid","123456");
        IResponse response = mClient.get(request,false);
        System.out.print(response.getCode()+"\n"+response.getContent());
    }

    @Test
    public void post() throws Exception {
        String url = Api.Config.getTestDomain() + Api.TEST_POST;
        IRequest request = new BaseRequestImpl(url);
        request.setBody("uid","123456");
        IResponse response = mClient.post(request,false);
        System.out.print(response.getCode()+"\n"+response.getContent());
    }

}