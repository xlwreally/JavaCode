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

        System.out.println( calculator("1 23 +"));
    }
    public static String calculator(String star){
        String[] s=star.split(" ");

        Stack<String> stack=new Stack<>();
        for (String ss:s
             ) {
            if(ss.matches("\\d+"))
            stack.push(ss);
            else {
                int num1= Integer.parseInt(stack.pop());
                int num2= Integer.parseInt(stack.pop());
                if(ss.equals("+"));
                stack.push(num1+num2+"");
            }
        }


        return stack.pop();
    }
}
