package managers;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JsonNode;

@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class Error {
    private String message;
    private int code;
    private JsonNode object;

    public Error() {
    }

    public Error(String message, int status) {
        this.message = message;
        this.code = status;
    }

    public Error(String message, int code, JsonNode object) {
        this.message = message;
        this.code = code;
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public JsonNode getObject() {
        return object;
    }

    public void setObject(JsonNode object) {
        this.object = object;
    }
}
