package top.moverco.mtaxiforpassenger.common.http;

import java.util.Map;

/**
 * Created by Moverco.
 */

public interface IRequest {
    public static final String POST = "POST";
    public static final String GET = "GET";

    /**
     * Set request method
     * @param method
     */
    void setMethod(String method);

    /**
     * Set request header
     * @param key
     * @param value
     */
    void setHeader(String key, String value);

    /**
     * Set request body
     * @param key
     * @param value
     */
    void setBody(String key,String value);

    /**
     * Get url
     * @return
     */
    String getUrl();

    /**
     * Get request headers
     * @return
     */
    Map<String,String> getHeader();

    /**
     * Get request body
     * @return
     */
    Object getBody();
}
