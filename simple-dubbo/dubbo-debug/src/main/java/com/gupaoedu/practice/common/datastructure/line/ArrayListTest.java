package com.gupaoedu.practice.common.datastructure.line;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by liuyanan on 2018-07-30.
 */
public class ArrayListTest {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String c = iterator.next();
            System.out.println(c);
        }

    }


}
