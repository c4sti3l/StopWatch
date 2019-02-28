package view;

import controller.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Stopuhr {
    private JFrame frame;
    private JButton button1;
    private JPanel mainPanel;
    private JLabel timeLabel;
    private JButton stopButton;
    private JList list1;
    private JSpinner spinner1;

    public Stopuhr(MainController controller) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {}
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNameOfButton("Start");
                setListModel((int) spinner1.getValue());
                setTimeLabel("00:00.000");
            }
        });

        SpinnerModel spinnerModel = new SpinnerNumberModel(1, 1, 10, 1);
        spinner1.setModel(spinnerModel);

        frame = new JFrame("Stopuhr");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }

    public void show() {
        frame.setVisible(true);
    }

    private void setListModel(int rounds) {
        DefaultListModel<String> list = new DefaultListModel<>();
        for (int i = 0; i < rounds; i++) {
            list.addElement("00:00.000");
        }
        list1.setModel(list);

        frame.pack();
    }

    public void setTimeLabel(String time) {
        timeLabel.setText(time);
        frame.repaint();
    }

    public void setNameOfButton(String name) {
        button1.setText(name);
    }
}