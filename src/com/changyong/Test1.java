package com.changyong;


import java.lang.String;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@interface  TestTable{
    String str() default "12345";
    int age();
}

class MyTest{
    @TestTable(str = "4567",age = 1)
    public void fun(){
        System.out.print("123456");
    }
}
public class Test1 {
    public static void main(String args[]) {
        MyTest t = new MyTest();
        t.fun();
    }
}
