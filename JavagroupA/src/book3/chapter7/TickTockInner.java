package book3.chapter7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TickTockInner {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockInner t = new TickTockInner();
        t.go();
    }

    private void go() {
        // create a timer that calls the Ticker class
        // at one second intervals
        //Timer t = new Timer(1000, new Ticker());
     //   t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);

         class Ticker implements ActionListener {
            private boolean tick = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (tick) {
                    System.out.println(tickMessage);
                } else {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }
        }
    }
}
