package com.asemokamichi;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        String s4=new String("Hello");
        String s5 = s4;
        s5 = "hjk";
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3.equals(s2));
        System.out.println(s5);
        System.out.println(s4);
    }
}
