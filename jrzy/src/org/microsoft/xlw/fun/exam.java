package org.microsoft.xlw.fun;

import java.util.ArrayList;
import java.util.List;

public class exam {
    public static void main(String[] args) {
        List<Operation> ops=new ArrayList<>();
        Operation t=new Operation();

        t.t="L";
        t.l=2;
        ops.add(t);
        Operation t1=new Operation();
        t1.t="D";
        t1.l=1;
        ops.add(t1);
        Operation t2=new Operation();
        t2.t="R";
        t2.l=4;
        ops.add(t2);
        Operation t3=new Operation();
        t3.t="I";
        t3.s="abcdef";
        t3.l=0;
        ops.add(t3);
        Operation t4=new Operation();
        t4.t="L";
        t4.l=3;
        ops.add(t4);
        Operation t5=new Operation();
        t5.t="B";
        t5.l=2;
        ops.add(t5);
        for (Operation m:ops
             ) {
            System.out.println(m.t);
        }
        System.out.println( solver("whatsyourproblem",5,ops));

    }

    public static String solver(String s, int p, List<Operation> ops) {
        /**********   Begin  **********/

        StringBuffer ss=new StringBuffer(s);
        for (int i = 0; i <=ops.size()-1 ; i++) {
            switch(ops.get(i).t.charAt(0)){
                case 'I':
                    ss.insert(p,ops.get(i).s);
                    p+=ops.get(i).s.length();
                    break;
                case 'B':
                    if(p-ops.get(i).l<0){
                        ss.delete(0,p);
                        p=0;
                        break;
                    }
                    ss.delete(p-ops.get(i).l,p);
                    p=p-ops.get(i).l;
                    break;
                case 'D':
                    if(p+ops.get(i).l>ss.length()-1){
                        ss.delete(p,ss.length()-1);
                        break;
                    }
                    ss.delete(p,p+ops.get(i).l);
                    break;
                case 'L':
                    if(p-ops.get(i).l<0){
                        p=0;
                        break;
                    }
                    p=p-ops.get(i).l;
                    break;
                case 'R':
                    if(p+ops.get(i).l>ss.length()-1){
                        p=ss.length()-1;
                        break;
                    }
                    p=p+ops.get(i).l;
                    break;

            }System.out.println(ss);
        }
        s=ss.toString();
        System.out.println(p);


        return s;
        /**********   End  **********/
    }
    static class Operation {
        String t;
        String s;
        int l;
    }
}
