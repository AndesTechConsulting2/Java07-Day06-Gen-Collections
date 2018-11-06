package org.andestech.learning.rfb18.g2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class AppCollections
{
    public static void main( String[] args )
    {
        ArrayList alist = new ArrayList();

        alist.add(new A(234));
        alist.add("121212");
        alist.add(222.22234);
        alist.add(222);

        ArrayList<Integer> alist2 = new ArrayList<>(50);
        alist2.add(123);
        alist2.add(777);
        alist2.add(555);

        alist2.add(1,111);

        System.out.println(alist2);
        System.out.println("list2 size: " + alist2.size());

       // System.out.println(alist2.get(10));

        Object[] arr = alist2.toArray();

        Integer[] arr2 = new Integer[alist2.size()];
        alist2.toArray(arr2);
        System.out.println(Arrays.toString(arr2));



       ArrayList<Integer> arrayList =
               new ArrayList<>(alist2);

       System.out.println(arrayList);

     //-----------------------------------------------

        LinkedList<String> linkedList =
        new LinkedList<>();

        linkedList.add("AA");
        linkedList.add("BB");
        linkedList.add("CC");
        linkedList.add("DD");

        LinkedList<Integer> linkedList2 =
                new LinkedList<>(alist2);

    }
}
