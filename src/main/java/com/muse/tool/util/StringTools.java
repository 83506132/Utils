package com.muse.tool.util;

import lombok.NonNull;

/**
 * description: 字符串工具箱
 *
 * @Author ZhaoMuse
 * @date 2022/4/3 11:20
 * @Since 1.0
 */
public class StringTools {

    public static String defaultValueBlankOrEmpty(String target, String defaultSource) {
        return target == null || target.length() == 0 || target.trim().length() == 0 ? defaultSource : target;
    }

    public static boolean isBlankOrEmpty(String target) {
        return target == null || target.length() == 0 || target.trim().length() == 0;
    }

    public static String splicing(String... target) {
        StringBuilder builder = new StringBuilder();
        for (String toAppend : target) {
            builder.append(toAppend);
        }
        return builder.toString();
    }

    public static String splicing(Object... target) {
        StringBuilder builder = new StringBuilder();
        for (Object toAppend : target) {
            builder.append(toAppend);
        }
        return builder.toString();
    }

    public static String firstHump(String s){
        StringBuilder builder = new StringBuilder(s);
        builder.replace(0, 1, Character.toString(s.charAt(0)).toUpperCase());
        return builder.toString();
    }
}
