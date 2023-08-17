package book3.chapter5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTock {
    public static void main(String[] args) {
Timer t = new Timer(1000, new Ticker());
t.start();
JOptionPane.showMessageDialog(null,"Click ok to exit");
    }
}
class Ticker implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
          boolean tick = false;

         if(tick) {
             System.out.println("tick......");

         }else {
             System.out.println(" tock......");
         }
         tick =!tick;
    }
}
