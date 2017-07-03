package com.iqiang.utils;

import java.util.UUID;

/**
 * Created by anyware on 17/6/19.
 */
public class UUIDUtil {
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        String[] uuids = uuid.split("-");
        StringBuilder sb = new StringBuilder();
        for (String str : uuids) {
            sb.append(str);
        }
        return sb.toString();
    }
}
