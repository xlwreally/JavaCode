package org.microsoft.xlw.day7.Arry;

public class ArrySort extends Arry{
    public ArrySort(int n) {
        super(n);
    }
    public void sort()
    {
        for(int i=0;i<getArr().length;i++)
        {
            for(int j=0;j<getArr().length;j++)
            {
                int temp=0;
                if(getArr()[i]<getArr()[j])
                {
                    temp=getArr()[i];
                    getArr()[i]=getArr()[j];
                    getArr()[j]=temp;
                }
            }
        }

    }
    public void reserve()
    {
        for(int i=0;i<getArr().length-1;i++)
        {

                    int temp;

                    temp=getArr()[i];
                    getArr()[i]=getArr()[i+1];
                    getArr()[i+1]=temp;


        }

    }
}
