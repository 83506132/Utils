package com.muse.tool.util.type.error;

import lombok.Getter;

/**
 * description:
 *
 * @Author ZhaoMuse
 * @date 2022/4/3 18:01
 * @Since
 */
@Getter
public class NotEmptyParameterException extends BaseException {
   public NotEmptyParameterException(String message, Integer code) {
      super(message, code);
   }

   public NotEmptyParameterException(String message, Throwable cause) {
      super(message, cause);
   }

   public NotEmptyParameterException(String message) {
      super(message);
   }

   public NotEmptyParameterException(String message, Throwable cause, Integer code) {
      super(message, cause, code);
   }

   public NotEmptyParameterException(Throwable cause) {
      super(cause);
   }
}
