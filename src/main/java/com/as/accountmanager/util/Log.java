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

    public static void debug(Class<?> clazz, Object obj) {
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.debug(obj.toString());
    }

    public static void debug(String classname, Object obj) {
        Logger logger = LoggerFactory.getLogger(classname);
        logger.debug(obj.toString());
    }

    public static void warn(Class<?> clazz, Object obj) {
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.warn(obj.toString());
    }

    public static void warn(String classname, Object obj) {
        Logger logger = LoggerFactory.getLogger(classname);
        logger.warn(obj.toString());
    }

    public static void error(Class<?> clazz, Object obj) {
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.error(obj.toString());
    }

    public static void error(String classname, Object obj) {
        Logger logger = LoggerFactory.getLogger(classname);
        logger.error(obj.toString());
    }
}
