package org.microsoft.xlw.boring.three;

public class Win {
    public static boolean isWin(int x, int y, Integer map[][]) {
        // 对胜负判断
        // 4个方向 左右 上下 左斜 右斜
        // 对一个棋子的一个方向的10颗棋子进行判断 是否满足5子连续
        // 左右

        int num = 1;
        for (int i = 0; i < 14; i++) {
            if (map[x][i] != 0) {
                if (map[x][i] == map[x][i + 1]) {
                    num++;
                    if (num >= 5) {
                        System.out.println("win");
                        return true;
                    }
                } else {
                    num = 1;
                }
            }
        }

        // 上下
        num = 1;
        for (int i = 0; i < 14; i++) {
            if (map[i][y] != 0) {
                if (map[i][y] == map[i + 1][y]) {
                    num++;
                    if (num >= 5) {
                        System.out.println("win");
                        return true;
                    }
                } else {
                    num = 1;
                }
            }
        }

        num=1;
        // 右斜 x-1 j+1
        for (int i = 0; i < map.length*2-1; i++) {
            for (int j = 1; j < map.length ; j++) {
                if (((i - j) >= 0) && ((i - j) < map.length)) {
                    if(map[j][i-j]!=0){
                        if(map[j][i-j]==map[j-1][i-j+1]){
                            num++;
                            if (num >= 5) {
                                System.out.println("win");
                                return true;
                            }
                        }else{
                            num=1;
                        }
                    }
                }
            }
        }

        num=1;
        //左斜 x+1 y+1
        for (int i = -map.length; i < map.length; i++) {
            for (int j = 1; j < map.length; j++) {
                if(((i+j)>=0)&&((i+j)<map.length)){
                    if(map[j][j+i]!=0){
                        if(map[j][i+j]==map[j+1][i+j+1]){
                            num++;
                            if (num >= 5) {
                                System.out.println("win");
                                return true;
                            }
                        }else{
                            num=1;
                        }
                    }
                }
            }
        }

        return false;
    }


}
