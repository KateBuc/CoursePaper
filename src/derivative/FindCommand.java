package derivative;

import obligations.Obligations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;


import static derivative.Derivative.getDerMap;

public class FindCommand implements Command {

    private JTextField txtName1 = new JTextField(10);
    private JTextField txtName2 = new JTextField(10);
    private JTextField txtName3 = new JTextField(10);


    private JButton btnn = new JButton("Find");

    private static Map<Integer, Obligations> obligations2;

    @Override
    public void execute() {

        JFrame window4 = new JFrame("Finding obligations");
        window4.setSize(400, 200);


        JPanel panel4 = new JPanel(new GridBagLayout());

        window4.getContentPane().add(panel4);

        GridBagConstraints constraints4 = new GridBagConstraints();


        constraints4.anchor = GridBagConstraints.FIRST_LINE_START;
        constraints4.gridx = 1;
        constraints4.gridy = 2;
        panel4.add(new JLabel("Is comercial obligation(true/false):  "), constraints4);
        constraints4.gridy++;
        panel4.add(new JLabel("Range of risk(from):  "), constraints4);
        constraints4.gridy++;
        panel4.add(new JLabel("Range of risk(till):  "), constraints4);

        constraints4.gridx = 2;
        constraints4.gridy = 2;


        panel4.add(txtName1, constraints4);
        constraints4.gridy++;


        panel4.add(txtName2, constraints4);
        constraints4.gridy++;


        panel4.add(txtName3, constraints4);
        constraints4.gridy++;


        panel4.add(btnn, constraints4);

        window4.setVisible(true);

        FindCommand.eventHandler eventHandler1 = new FindCommand.eventHandler();


        btnn.addActionListener(eventHandler1);



    }


    public class eventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event1) {
            if (event1.getSource() == btnn) {
                JFrame window5 = new JFrame("found obligations");
                window5.setSize(400, 200);

                JPanel panel5 = new JPanel(new GridBagLayout());

                window5.getContentPane().add(panel5);

                GridBagConstraints constraints5 = new GridBagConstraints();

                Boolean comercial = true;
                Double start = 0.0;
                Double end = 14.0;

                comercial = Boolean.valueOf(txtName1.getText());
                start = Double.valueOf(Integer.parseInt(txtName2.getText()));
                end = Double.valueOf(Integer.parseInt(txtName3.getText()));



                JLabel[] arrOfLabelsObl = new JLabel[6];

                for (int f = 0; f < 6; f++) {
                    arrOfLabelsObl[f] = new JLabel("");
                }
                for (int t = 0; t < 6; t++) {
                    constraints5.gridy = t;
                    constraints5.gridx = 0;

                    panel5.add(arrOfLabelsObl[t], constraints5);

                }

                constraints5.anchor = GridBagConstraints.LINE_START;

                obligations2 = getDerMap();

                for (Map.Entry<Integer, Obligations> entry : obligations2.entrySet()) {
                    Integer key = entry.getKey();
                    if (obligations2.get(key).getType() == comercial) {
                        if (obligations2.get(key).getPercentOfRisk() >= start && obligations2.get(key).getPercentOfRisk() <= end) {
                            for (int k = 0; k < 1; k++) {
                                arrOfLabelsObl[k].setText(obligations2.get(key).getObligations());

                            }
                        }


                    }


                }

                window5.setVisible(true);

            }

        }
    }
}