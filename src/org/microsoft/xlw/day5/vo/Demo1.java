package org.microsoft.xlw.day5.vo;

public class Demo1 {
    private  int score1;
    private  int score2;
    private  int score3;
    private  int score[];

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public Demo1(int score1, int score2, int score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    public Demo1() {

    }
    public int sum()
    {
        return score1+score2+score3;
    }
}
