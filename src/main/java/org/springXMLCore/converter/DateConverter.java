package org.springXMLCore.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter{


    public Date toDate(String datePattern, String dateInput) throws ParseException {
        System.out.println(dateInput+" "+datePattern);
        return new SimpleDateFormat(datePattern).parse(dateInput);
    }



}
