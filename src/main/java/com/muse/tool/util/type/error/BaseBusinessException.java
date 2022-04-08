package com.muse.tool.util.type.error;

/**
 * description:
 *
 * @Author ZhaoMuse
 * @date 2022/4/8 19:29
 * @Since
 */
public class BaseBusinessException extends Exception {
    private final Integer code;

    public BaseBusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public BaseBusinessException(String message, Throwable cause) {
        super(message, cause);
        code = null;
    }

    public BaseBusinessException(String message) {
        super(message);
        code = null;
    }

    public BaseBusinessException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public BaseBusinessException(Throwable cause) {
        super(cause);
        code = null;
    }
}
