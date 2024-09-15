package utils;

import constants.CommonConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static Date parseDate(String dateStr) throws ParseException {
        return new SimpleDateFormat(CommonConstants.DATE_FORMAT).parse(dateStr);
    }

    public static String formatDate(Date date) {
        return new SimpleDateFormat(CommonConstants.DATE_FORMAT).format(date);
    }
}