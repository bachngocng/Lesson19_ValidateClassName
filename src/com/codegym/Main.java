package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	 /*
        Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
        Không chứa các ký tự đặc biệt
        Theo sau ký tự bắt đầu là 4 ký tự số
        Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
     */

        public static void main(String[] args) {
            showValidClassName("C1121G");
            showValidClassName("C1121G1");
            showValidClassName("C112021G");
            showValidClassName("A1121H1");
            showValidClassName("N1231I1");
        }

        public static void showValidClassName(String className){
            System.out.println(className + " " + (validClassName(className) ? "hợp lệ." : "không hợp lệ."));
        }

        public static boolean validClassName(String className){
//        String CLASSNAME_REGEX = "^[CAP]\\d{4}[GHIKLM]";
            String CLASSNAME_REGEX = "^[CAP]\\d{4}[GHIKLM]\\d{0,}"; // thêm so với dòng trên: cho phép chữ số nằm sau giờ GHIKLM
            Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
            Matcher matcher = pattern.matcher(className);
            return matcher.matches();
        }
    }

