package org.xk.utils;

import org.apache.commons.lang3.StringUtils;
import org.xk.Interfaces.MyAutowired;
import org.xk.Interfaces.MyController;
import org.xk.Interfaces.MyMapping;
import org.xk.Interfaces.MyService;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigurationUtils {



    public static Properties properties;
    public ConfigurationUtils(String propertiesPath){
        properties = this.getBeanScanPath(propertiesPath);
    }

    private Properties getBeanScanPath(String propertiesPath){
        if(StringUtils.isEmpty(propertiesPath)){
            propertiesPath = "/application.properties";
        }
        Properties properties = new Properties();
        //通过类的加载器获取具有给定名称的资源
        InputStream in = ConfigurationUtils.class.getResourceAsStream(propertiesPath);
        try {
            System.out.println("正在加载配置文件");
            properties.load(in);
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(in!=null){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }


    public static Object getPropertiesByKey(String propertiesKey){
        if(properties.size() >0){
            return properties.get(propertiesKey);
        }
        return null;
    }



}
