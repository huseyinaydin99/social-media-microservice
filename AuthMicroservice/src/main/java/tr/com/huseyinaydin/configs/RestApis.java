package tr.com.huseyinaydin.configs;

public class RestApis {
    public static final String DEVELOPER = "/dev";
    public static final String TEST = "/test";
    public static final String RELEASE = "/prod";
    public static final String VERSIONS = "/v1";

    public static final String AUTHSERVICE = DEVELOPER + VERSIONS + "/auth"; //ister teste çek, ister developer'e çek ister release çek.

    public static final String REGISTER = "/register";
    public static final String LOGIN = "/login";
    public static final String CREATE_USER = "/create-user";
}