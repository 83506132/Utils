package com.muse.tool.util.type.error;

/**
 * description:
 *
 * @Author ZhaoMuse
 * @date 2022/4/8 19:28
 * @Since
 */
public class RedisConnectionException extends BaseBusinessException{
    public RedisConnectionException(String message, Integer code) {
        super(message, code);
    }

    public RedisConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public RedisConnectionException(String message) {
        super(message);
    }

    public RedisConnectionException(String message, Throwable cause, Integer code) {
        super(message, cause, code);
    }

    public RedisConnectionException(Throwable cause) {
        super(cause);
    }
}
