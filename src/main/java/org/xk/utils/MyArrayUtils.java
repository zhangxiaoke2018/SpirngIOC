package org.xk.utils;

import org.apache.commons.lang3.ArrayUtils;

public class MyArrayUtils {
    public static boolean useArrayUtils(String[] arr,String targetValue){
        return ArrayUtils.contains(arr,targetValue);
    }
    public static boolean useArrayUtils(Class[] arr,Class targetValue){
        return ArrayUtils.contains(arr,targetValue);
    }
}
