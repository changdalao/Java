package com.changyong;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
    public static  void main(String []args){
        FileInputStream fi = null;
        try{
            fi = new FileInputStream("a.txt");
        }
        catch (IOException ie){
            System.out.println(ie.getMessage());
        }
        finally {
            if(fi != null){
                try{
                    fi.close();
                }
                catch (IOException io){
                    io.printStackTrace();
                }
            }
            System.out.println("回收硬件资源！");
        }
    }
}
