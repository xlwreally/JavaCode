package org.microsoft.xlw.cycle7;

/**
 * @author 熊立伟
 * @version 1.0
 * @date 2019/11/9 16:39
 */
public class Cycle {
    Kid start;
    Kid end;

    public Cycle(int num) {
        this.start=new Kid(1);
        Kid p=this.start;
        for (int i = 2; i <=num ; i++) {
            Kid tmp=new Kid(i);
            tmp.left=p;
            p.right=tmp;
            p=tmp;
        }
        p.right=this.start;
        this.end=p;
        this.start.left=p;
    }

}
