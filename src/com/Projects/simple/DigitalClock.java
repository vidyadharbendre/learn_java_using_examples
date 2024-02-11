package com.Projects.simple;

import javax.swing.*;
        import java.awt.*;
        import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {

    private JLabel timeLabel;

    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 30));

        add(timeLabel);

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        SimpleDateFormat dateFormatRefObj;
        dateFormatRefObj = new SimpleDateFormat("HH:mm:ss");
        String formattedTimeRefObj;
        formattedTimeRefObj = dateFormatRefObj.format(new Date());
        timeLabel.setText(formattedTimeRefObj);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DigitalClock digitalClockRefObj;
            digitalClockRefObj = new DigitalClock();
            digitalClockRefObj.setLocationRelativeTo(null); // Center the frame
            digitalClockRefObj.setVisible(true);
        });
    }
}

