package day1.xlw;
import java.util.Scanner;
public class game {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        boolean flag=true,Comparison=false;
        int a=1,n=0;
        String guess,result="0";
//        a=sc.nextInt();

        while (flag)
        {
            int real=(int)(1+Math.random()*(3-1+1));
            switch(real)
        {
            case 1:
                result="石头";
                break;
            case 2:
                result="剪刀";
                break;
            case 3:
                result="布";
                break;
        }
            System.out.println(">>>>>>>>>>>>>>>>>");
            System.out.println("你出石头还是剪刀布");
            guess=sc.nextLine();

            switch(guess)
            {
                case "石头":
                    if(real==2) Comparison=true;
                    if(real==3) Comparison=false;
                    break;
                case "剪刀":
                    if(real==3) Comparison=true;
                    if(real==1) Comparison=false;
                    break;
                case "布":
                    if(real==1) Comparison=true;
                    if(real==2) Comparison=false;
                    break;
            }
            if(guess.equals("石头")||guess.equals("剪刀")||guess.equals("布"))
            {
                if(result.equals(guess))
                {
                    System.out.println("恭喜你，我出的是"+result+"平局了");
                }

                else
                {
                    if(Comparison)
                    {
                        System.out.println("你赢了，我出的是"+result+"而你出的是"+guess);
                        n++;
                    }
                    else System.out.println("你输了，我出的是"+result+"而你出的是"+guess);
                }
                System.out.println("目前为止你赢了"+n+"局");
            }
            else
                System.out.println("输入错误");

        }
    }
}
