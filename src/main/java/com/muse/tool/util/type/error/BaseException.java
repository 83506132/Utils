package com.muse.tool.util.type.error;

/**
 * description:
 *
 * @Author ZhaoMuse
 * @date 2022/4/8 19:30
 * @Since
 */
public class BaseException extends RuntimeException {
    private final Integer code;

    public BaseException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
        code = null;
    }

    public BaseException(String message) {
        super(message);
        code = null;
    }

    public BaseException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public BaseException(Throwable cause) {
        super(cause);
        code = null;
    }
}
