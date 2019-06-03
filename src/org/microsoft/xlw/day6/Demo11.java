package org.microsoft.xlw.day6;

public class Demo11 {
    private  Double Score;
    private Demo111 demo=new Demo111();

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public Demo111 getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo.setName(demo);
    }
}
