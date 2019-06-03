package org.microsoft.xlw.day7.Arry;

public class main {
    public static void main(String[] args) {
        ArrySort sort=new ArrySort(5);
        sort.add(3);
        sort.add(4);
        sort.add(5);
        sort.add(1);
        for (int a:
        sort.getArr()) {
            System.out.print(a+"\t");
        }
        System.out.println("");
        sort.sort();
        for (int a:
                sort.getArr()) {
            System.out.print(a+"\t");
        }


    }
}
