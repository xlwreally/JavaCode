package org.microsoft.xlw.cycle7;

/**
 * @author 熊立伟
 * @version 1.0
 * @date 2019/11/9 16:41
 */
public class main {
    public static void main(String[] args) {
        Cycle cy=new Cycle(1000);
         Kid p=cy.start;

         p=cy.start;
        int n=1;
        while (true){

            if (n==7){
                Kid del=p;
                System.out.println("del:"+del.id);
                new Kid().del(del);
                n=1;
            }else n++;
            p=p.right;
            if (p==p.right)break;
        }
        System.out.println(p.id);
//        int[] res=new int[1000];
//        for (int i = 0; i <1000 ; i++) {
//            res[i]=i+1;
//        }
//        n=1;
//        int i=0;
//        while (true){
//
//            if(n==7){
//                System.out.println(res[i]);
//               res[i]=-1;
//               n=1;
//
//            }else n++;
//            while (true){
//                if(i==999)i=0;
//                else i++;
//                if(res[i]!=-1)break;
//            }
//
//
//        }
    }
}