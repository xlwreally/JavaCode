package org.microsoft.xlw.day11;

public class erroclass  {
    public static void main(String[] args){

        try {
            System.out.println(ma());
        }catch (Exception a)
        {
            System.out.println("sda\t"+a);
        }


        System.out.println("hello");

    }
    public static int ma() throws Exception
    {
        return 2/0;
    }
}
