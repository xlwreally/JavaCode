package org.microsoft.xlw.day2;

public class homework {
    public static void main(String[] args) throws Exception{
        try {
            System.out.println(333 / 0);
           int a[]=new int[3];
            a[6]=3456;

        } catch (ArithmeticException a) {
            System.out.println(a);
        } catch (Exception a) {
            System.out.println(a);

        }
        System.out.println(34/0);
        System.out.println("dfsg");
    }
}
