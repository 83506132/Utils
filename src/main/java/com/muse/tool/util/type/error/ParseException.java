package com.muse.tool.util.type.error;

/**
 * description:
 *
 * @Author ZhaoMuse
 * @date 2022/4/3 19:25
 * @Since
 */
public class ParseException extends BaseException {
    public ParseException(String message, Integer code) {
        super(message, code);
    }

    public ParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParseException(String message) {
        super(message);
    }

    public ParseException(String message, Throwable cause, Integer code) {
        super(message, cause, code);
    }

    public ParseException(Throwable cause) {
        super(cause);
    }
}
