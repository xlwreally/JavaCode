package org.microsoft.xlw.test;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
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
        this.end=new Kid(num);
        this.start.left=this.end;
        this.start.right=this.end;
        this.end.left=this.start;
        this.end.right=this.start;
        Kid p=this.start;
        for (int i = 2; i <num ; i++) {
            Kid tmp=new Kid(i);
            tmp.left=p;
            p.right=tmp;
            p=tmp;
        }
        p.right=this.end;
        this.end.left=p;
    }
}
