package com.lx.stu.week3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author faine
 * @Date 2020/10/19
 */
public class FormatUtil {
    public static String format(Date date, String regex){
        SimpleDateFormat sdf = new SimpleDateFormat(regex);
        return sdf.format(date);
    }
}
