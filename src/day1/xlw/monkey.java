package day1.xlw;

public class monkey
{
    public static void main(String[] args) {
        double n=2,i;
        while(true)
        {
            n+=2;
           i=n;
           for(int d=1;d<10;d++)
           i=(i/2-1);
           if(i==1)break;
        }
        System.out.println((int)n);
        n=6;
        while(true)
        {
            n+=5;
            i=n;
            for(int d=1;d<5;d++)
            {
                i=(i-1)/5*4;
            }
            if(i%5==1)break;

        }
        System.out.println((int)n);
    }
}
