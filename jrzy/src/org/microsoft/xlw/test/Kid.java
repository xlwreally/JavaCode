package org.microsoft.xlw.test;

/**
 * @author 熊立伟
 * @version 1.0
 * @date 2019/11/9 16:38
 */
public class Kid {
    public Kid left;
    public int id;
    public Kid right;

    public Kid(int id) {
        this.id = id;
    }
    public Kid() {
    }
    public void del(Kid op){
        Kid left=op.left;
        Kid right=op.right;
        left.right=right;
        right.left=left;
    }
}
