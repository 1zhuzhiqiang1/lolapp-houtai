package com.iqiang.test;

import com.iqiang.utils.UUIDUtil;
import org.junit.Test;

/**
 * Created by anyware on 17/6/19.
 */
public class UUIDTest {

    @Test
    public void run1() {
        String uuid = UUIDUtil.getUUID();
        System.out.println(uuid + "：" + uuid.length());
    }
}
