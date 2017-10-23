package top.moverco.mtaxiforpassenger.common.config;

import top.moverco.mtaxiforpassenger.BuildConfig;

/**
 * Created by Moverco.
 */

public class Api {
    public static final String TEST_GET= "/get?uid=${uid}";
    public static final String TEST_POST = "/post";
    // Get message code
    public static final String GET_SMS_CODE =
            "/f34e28da5816433d/getMsgCode?phone=${phone}";
    // Check message code
    public static final String CHECK_SMS_CODE =
            "/f34e28da5816433d/checkMsgCode?phone=${phone}&code=${code}" ;
    // Api for registe
    public static final String REGISTER = "/f34e28da5816433d/register";
    // Api for log in
    public static final String LOGIN = "/f34e28da5816433d/auth";
    // Api for log in with token
    public static final String LOGIN_BY_TOKEN = "/f34e28da5816433d/login";
    //Api for get nearby drivers
    public static final String GET_NEAR_DRIVERS = "/f34e28da5816433d/getNearDrivers?latitude=${latitude}&longitude=${longitude}";
    // Api for upload current location
    public static final String UPLOAD_LOCATION = "/f34e28da5816433d/updateUserLocation";
    // Api for call driver
    public static final String CALL_DRIVER = "/f34e28da5816433d/callDriver";

    // Api for cancel order
    public static final String CANCEL_ORDER = "/f34e28da5816433d/cancelOrder";
    // Api for pay successfully
    public static final String PAY = "/f34e28da5816433d/paySuc";
    // Api for get processing order
    public static final String GET_PROCESSING_ORDER = "/f34e28da5816433d/getProcessingOrder";

    // Api for check if user exist
    public static String CHECK_USER_EXIST =
            "/f34e28da5816433d/isUserExist?phone=${phone}";

    /**
     *  Config domain information
     */
    public static class Config {
        private static final String TEST_DOMAIN = "http://httpbin.org";
        private static final String DEBUG_DOMAIN = "http://cloud.bmob.cn";
        private static final String RElEASE_DOMAIN = "http://cloud.bmob.cn";
        private static final String DEBUG_APP_ID = "e90928398db0130b0d6d21da7bde357e";
        private static final String RELEASE_APP_ID = "e90928398db0130b0d6d21da7bde357e";
        private static final String DEBUG_API_KEY = "514d8f8a2371bdf1566033f6664a24d2";
        private static final String RELEASE_APP_KEY = "514d8f8a2371bdf1566033f6664a24d2";
        private static String appId = DEBUG_APP_ID;
        private static String apiKey = DEBUG_API_KEY;
        private static String domain = DEBUG_DOMAIN;

        /**
         * Return different infomation depending on the build type.
         */
        static {
            boolean debug = BuildConfig.IS_DEBUG;
            domain = debug ? DEBUG_DOMAIN : RElEASE_DOMAIN;
            appId = debug ? DEBUG_APP_ID : RELEASE_APP_ID;
            apiKey = debug ? DEBUG_API_KEY : RELEASE_APP_KEY;
        }
        public static String getDomain() {
            return domain;
        }
        public static String getTestDomain(){
            return TEST_DOMAIN;
        }
        public static String getAppId () {
            return appId;
        }
        public static String getApiKey () {
            return apiKey;
        }
    }
}
