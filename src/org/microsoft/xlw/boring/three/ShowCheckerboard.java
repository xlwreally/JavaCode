package org.microsoft.xlw.boring.three;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static org.microsoft.xlw.boring.three.main.MAX;

class MyActionListener implements ActionListener {

    private JButton a=new JButton();

    public MyActionListener(JButton m) {
        a=m;
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        String ss[]=a.getName().split("-");
        if (Data.checkerboards[Integer.parseInt(ss[0])][Integer.parseInt(ss[1])]!=0)return;
       a.setText("●");

       System.out.println(a.getName());
       Data.checkerboards[Integer.parseInt(ss[0])][Integer.parseInt(ss[1])]=1;

       if (Win.isWin(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]),Data.checkerboards))
       {
           JOptionPane.showMessageDialog(null,"你赢了");
       }
       else{
           ComputerRun.sjbrun();
       }
    }
}
public class ShowCheckerboard {
  public static   JButton Bu[][]=new JButton[MAX][MAX];
    public static void ShowGui(){
        JFrame gui=new JFrame("五子棋 Alpha 1");
        gui.setVisible(true);
        gui.setSize(700,700);
        gui.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                super.windowClosing(e);
            }
        });
        gui.setLayout(new GridLayout(MAX, MAX, 0, 0));

        for (int i = 0; i < MAX; i++)
            for (int j = 0; j <MAX ; j++) {
                Data.checkerboards[i][j]=0;
                Bu[i][j]=new JButton(" ");
                Bu[i][j].setName(i+"-"+j);
                Bu[i][j].addActionListener(new MyActionListener(Bu[i][j]));


                gui.add(Bu[i][j]);

            }


    }





}
