package com.muse.tool.util.access;

import com.muse.tool.util.ObjectTools;
import com.muse.tool.util.type.error.NotEmptyParameterException;

/**
 * description: 对象判断放行器
 *
 * @Author ZhaoMuse
 * @date 2022/4/3 17:03
 * @Since 1.0
 */
public class ObjectAccess {

    public static void isEmpty(Object o, String massage) {
        if (ObjectTools.isEmpty(o)) {
            throw new NotEmptyParameterException(massage);
        }
    }
}
