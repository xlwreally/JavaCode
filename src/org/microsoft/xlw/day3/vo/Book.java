package org.microsoft.xlw.day3.vo;

public class Book {
    private String title;
    private int pageNum;
    private String type;

    public Book(int a)
    {
            if(a==1)
            this.type = "计算机";

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if(pageNum>200)
            this.pageNum = pageNum;
        else
        {
            System.out.println("页数过少");
            System.exit(6666);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void detail()
    {
        System.out.println("名称:"+title+"\t页数:"+pageNum+"\t种类:"+type);
    }
}
