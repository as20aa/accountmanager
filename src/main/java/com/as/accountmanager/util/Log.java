package com.as.accountmanager.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Log {
    public static void info(Class<?> clazz, Object obj) {
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.info(obj.toString());
    }

    public static void info(String classname, Object obj) {
        Logger logger = LoggerFactory.getLogger(classname);
        logger.info(obj.toString());
    }
}
