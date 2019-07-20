package com.changyong;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class num implements Comparable{
    public int num;

    public num(int i){
        this.num=i;
    }

    @Override
    public int compareTo(Object o) {
        if(o.equals(this))
            return 0;
        else if(((num)o).num > this.num)
            return 1;
        else
            return -1;
    }

}

public class Test2 {
    public static void main(String args[]){
        TreeSet tree = new TreeSet();
        tree.add(new num(3));
        tree.add(new num(1));
        tree.add(new num(8));
        tree.add(new num(2));

        /*IntStream it = IntStream.builder()
                        .add(1)
                        .add(4)
                        .add(8)
                        .add(10)
                        .build();
        Stream is = Stream.builder()
                    .add("1234")
                    .add("2345")
                    .build();*/
        //System.out.println(it.filter(ele -> ele > 4).findFirst());
        //System.out.println(it.filter( ele -> ele % 2 == 0 ).count());

    }
}
