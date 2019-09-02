package org.microsoft.xlw.day11;

public class tryy {
    public static void main(String[] args) {
        int a=10;
        int num=0;
        int arr[]=new int[3];


        //num=a/0;
        try{
            num=a/0;
            System.out.println(arr[3]);
        }catch(ArithmeticException e)
        {
            System.out.println(e);

        }catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("hello world");
        }

    }
}
