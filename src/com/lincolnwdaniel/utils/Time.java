package com.lincolnwdaniel.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lincoln W Daniel on 5/22/2016.
 */
public class Time {
    public static String getCurrentDateTime(DateFormat dateFormat) {
        dateFormat = dateFormat != null ? dateFormat : new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(new Date());
    }
}
