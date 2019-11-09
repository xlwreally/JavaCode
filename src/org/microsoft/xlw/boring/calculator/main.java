package org.microsoft.xlw.boring.calculator;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 熊立伟
 * @version 1.0
 * @date 2019-09-02 10:46
 */
public class main {
    public static void main(String[] args) {
//        System.out.println(evalToString("1+1+3434/2"));
        System.out.println(calculator(change(evalToString("1+((2+3）*4）-5"))));
//        System.out.println( calculator("1 + 2 * 3 "));

    }
    public static List<String> evalToString(String eval){
        List<String> li=new ArrayList<>();
        for (int i = 0; i <eval.length() ; i++) {
            StringBuffer tmp=new StringBuffer();
            while (true){
                if(eval.charAt(i)>48&&eval.charAt(i)<57){
                    tmp.append(eval.charAt(i));
                   if(i==eval.length()-1){
                       li.add(tmp.toString());
                       return li;
                   }
                   i++;
                }else break;
            }
            li.add(tmp.toString());
            li.add(String.valueOf(eval.charAt(i)));
        }
        System.out.println("表达式错误");
        return null;
    }
    public static String[] change(List<String> li){
        String[] s2=new String[li.size()];
        int i=0;

        Stack<String> s1=new Stack<>();
        for (String op:li
             ) {

                if (op.matches("\\d+")) {
                    s2[i] = op;
                    i++;
                } else if (s1.isEmpty()) {
                    s1.add(op);
                } else if (op.equals(")")) {
                    while(!s1.peek().equals("(")
                    ) {

                        s2[i] = s1.pop();
                        i++;
                    }
                } else{
                    while(s1.size()!=0&&priority(s1.peek()) <= priority(op)) {
                        s2[i] = s1.pop();
                        i++;
                    }
                }





        }
        for (String res:s1
             ) {
            s2[i]=res;
            i++;
        }
        return s2;
    }
    public static int priority(String a){
        switch (a.charAt(0)){
            case '+':
                return 3;
            case '-':
                return 3;
            case '*':
                return 2;
            case '/':
                return 2;
            default:
                System.out.println("sjb");
                System.exit(66);
                return 0;
        }
    }
    public static String calculator(String[] s){

        for (int i=0;i<s.length;i++
        ){
            if(s[i].equals("+")||s[i].equals("-")||s[i].equals("*")||s[i].equals("/")){
                String tmp=s[i];
                s[i]=s[i+1];
                s[i+1]=tmp;
                i++;
            }
        }
            Stack<String> stack=new Stack<>();
        for (String ss:s
             ) {
            if(ss.matches("\\d+")) stack.push(ss);
            else {
                int num1= Integer.parseInt(stack.pop());
                int num2= Integer.parseInt(stack.pop());
                if(ss.equals("+")){
                    stack.push(String.valueOf(num1+num2));
                }else if(ss.equals("*")){
                    stack.push(String.valueOf(num1*num2));
                }else if(ss.equals("-")){
                    stack.push(String.valueOf(num2-num1));
                }else if(ss.equals("/")){
                    stack.push(String.valueOf(num2/num1));
                }
            }
            System.out.println(stack);
        }


        return stack.pop();
    }
}
