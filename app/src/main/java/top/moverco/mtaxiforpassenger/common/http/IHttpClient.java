package top.moverco.mtaxiforpassenger.common.http;

/**
 * Created by Moverco.
 */

public interface IHttpClient {
    IResponse get(IRequest request,boolean forceCache);
    IResponse post(IRequest request,boolean forceCache);
}
