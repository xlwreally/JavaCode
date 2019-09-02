package org.microsoft.xlw.boring.three;

import java.util.Random;

public class ComputerRun {
    public static void sjbrun(){
        Random random=new Random();
        while (true){
            int a=random.nextInt(14),b=random.nextInt(14);
            if(Data.checkerboards[a][b]==0)
            {
                Data.checkerboards[a][b]=2;
                System.out.println(a);
                ShowCheckerboard.Bu[a][b].setText("○");
                Win.isWin(a,b,Data.checkerboards);
                break;
            }
        }
    }
}
