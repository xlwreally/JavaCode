package org.microsoft.xlw.day7.Arry;

public class Arry {
    private int arr[];
    private int foot=0;
   public Arry(int n)
   {
       if(n>0)
       {
           arr=new int[n];
       }
       else
       {
           arr=new int[1];
       }
   }
   public boolean add(int n)
   {
       if(this.arr.length>foot)
       {
           this.arr[foot]=n;
           foot++;
           return true;
       }
       else
           return false;
   }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
