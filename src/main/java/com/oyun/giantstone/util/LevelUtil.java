package com.oyun.giantstone.util;

import com.sun.tools.hat.internal.model.Root;
import org.apache.commons.lang3.StringUtils;

/**
 * @program: giantstone
 * @description: 层级工具类
 * @author: changzhen
 * @create: 2018-06-14 22:35
 **/
public class LevelUtil {

    public static final String SEPARATOR = ".";

    public static final String ROOT = "0";

    public static String calculateLevel(String parentLevel,Integer parentId){
        if (StringUtils.isBlank(parentLevel)){
            return ROOT;
        }else {
            return StringUtils.join(parentLevel,SEPARATOR,parentId);
        }
    }

}
