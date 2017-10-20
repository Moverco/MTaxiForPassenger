package top.moverco.mtaxiforpassenger.common.http;

/**
 * Created by Moverco.
 */

public interface IResponse {
    /**
     * Get response code
     * @return
     */
    int getCode();

    /**
     * Get response content
     * @return
     */
    String getContent();
}
