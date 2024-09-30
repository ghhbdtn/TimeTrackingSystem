package system;

public class Request {

    private RequestType type;

    private Class<?> aClass;

    private Object data;
    public Request (RequestType type, Class<?> aClass, Object data) {
        this.type = type;
        this.aClass = aClass;
        this.data = data;
    }

    public enum RequestType {
        GET, PUT, POST, DELETE, GENERATE;
    }
}
