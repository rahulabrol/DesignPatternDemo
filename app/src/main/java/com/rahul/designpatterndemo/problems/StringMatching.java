package com.rahul.designpatterndemo.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringMatching {

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(largestString(str1, str2));
    }

    private static String largestString(String str1, String str2) {
        String div = "";

        char[] strch1 = str1.toCharArray();
        char temp = strch1[0];
        for (int i = 1; i < strch1.length - 1; i++) {
            if (temp == strch1[i]) {
                div = str1.substring(0, i);
            }
        }

        return getMainStrnig(div, str1, str2);
    }

    private static String getMainStrnig(String div, String str1, String str2) {

        if (getSize(str1, div) < 2 && getSize(str2, div) < 2) {
            return div;
        }

        return "";
    }

    private static int getSize(String str1, String div) {

        HashSet<String> st = new HashSet<>();
        String[] sp = str1.split(div);
        for (int i = 0; i < sp.length; i++) {
            st.add(sp[i]);
        }
        return st.size();
    }

    private List<String> splitStr(String str, String regex) {
        List<String> al = new ArrayList<>();
        char[] given = str.toCharArray();
        char[] regx = str.toCharArray();

        for (int i = 0; i < regx.length; i++) {
            for (int j = 0; j < given.length; j++) {

            }
        }

        return al;
    }
}
