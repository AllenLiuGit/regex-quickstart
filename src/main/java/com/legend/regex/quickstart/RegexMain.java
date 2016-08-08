package com.legend.regex.quickstart;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by allen on 8/8/16.
 */
public class RegexMain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("com\\.legend.regex.*");
        Matcher matcher = pattern.matcher("com-legend.regexs.quickstart.RegexMain.main");
        System.out.println(matcher.matches());
    }
}
