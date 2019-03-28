package com.hamza.school.utils;

import java.io.File;

public class MyFileUtils {
    public static String getUserFilePath(String fileName) {
        String resultFileLocation = System.getProperty("user.dir");
        return resultFileLocation + File.separator + fileName;
    }

}
