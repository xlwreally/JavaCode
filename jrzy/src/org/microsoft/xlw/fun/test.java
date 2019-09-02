package org.microsoft.xlw.fun;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        char[][] area=new char[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                area[i][j]=s.nextLine().charAt(0);
            }

        }
            virusArea(n,m,area);
        }
    public static int virusArea(int n,int m,char[][] area){
        /********* Begin *********/
        int total=0,s;
        int[][][]   map=new int[9][9][9];
        boolean flag=true;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(area[i][j]=='o'){
                    flag=true;
                    if(i>0&&j>0){
                        for(s=0;s<total;s++){
                            if(map[s][i][j+1]==1||map[s][i+1][j]==1||map[s][i][j-1]==1||map[s][i-1][j]==1){
                                map[s][i][j]=1;
                                flag=false;
                                break;
                            }
                        }
                    }
                    else{
                        for(s=0;s<total;s++){
                            if(map[s][i][j+1]==1||map[s][i+1][j]==1){
                                map[s][i][j]=1;
                                flag=false;
                                break;
                            }
                        }
                    }
                    if(flag){
                        map[total][i][j]=1;
                        total++;
                    }
                }
            }
        return total-1;
        /********* End *********/
    }


}
