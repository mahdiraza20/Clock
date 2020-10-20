package m_mehdi;


import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

/**
 * the MyFrame class outputs clock in graphical frame
 */

public class MyFrame extends JFrame {
    JLabel timeLabel;
    ClockDisplay clck;

    /**
     * constructor to make the graphical view
     * @param clck an object of class ClockDisplay
     */

    MyFrame(ClockDisplay clck) {
        ClockDisplay clk = new ClockDisplay();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Clock");
        setLayout(new FlowLayout());
        setSize(350,110);
        setResizable(false);
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        setVisible(true);
        while (true) {
            timeLabel.setText(clck.getTime());
            clck.timeTick();
            this.add(timeLabel);
        }

    }


}
