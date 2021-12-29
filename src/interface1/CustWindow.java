package interface1;
import derivative.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustWindow extends JFrame{
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;


    public CustWindow(Do menu){

        //creating main window
        JFrame window = new JFrame("Derivative");
        window.setSize(550,350);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());

        window.getContentPane().add(panel);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.ABOVE_BASELINE;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weighty = 1.5;
        // adding elements(buttons and explanations)
        panel.add(btn1 = new JButton("Create"),constraints);
        constraints.gridy++;
        panel.add(btn2 = new JButton(" Find "),constraints);
        constraints.gridy++;
        panel.add(btn3 = new JButton("Price "),constraints);
        constraints.gridy++;
        panel.add(btn4 = new JButton(" Sort "),constraints);


        lbl1 = new JLabel(" - create derivative");
        lbl2 = new JLabel(" - find obligations by parameters");
        lbl3 = new JLabel(" - calculate the cost");
        lbl4 = new JLabel(" - sort derivative obligations based on risk reduction");
        constraints.anchor = GridBagConstraints.LINE_START;
        constraints.gridx=1;
        constraints.gridy=0;
        constraints.gridwidth=3;
        panel.add(lbl1,constraints);
        constraints.gridy++;
        panel.add(lbl2,constraints);
        constraints.gridy++;
        panel.add(lbl3,constraints);
        constraints.gridy++;
        panel.add(lbl4,constraints);


        eventHandler eventHandler1 = new eventHandler();

        btn1.addActionListener(eventHandler1);
        btn2.addActionListener(eventHandler1);
        btn3.addActionListener(eventHandler1);
        btn4.addActionListener(eventHandler1);
        window.setVisible(true);

    }

    public class eventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event1){
            if(event1.getSource()==btn1){
                CreateCommand createCommand = new CreateCommand();
                createCommand.execute();
            }
            else if(event1.getSource()==btn2){
                FindCommand findCommand = new FindCommand();
                findCommand.execute();
            }
            else if(event1.getSource()==btn3){
                PriceCommand priceCommand = new PriceCommand();
                priceCommand.execute();
            }
            else if(event1.getSource()==btn4){
                SortCommand sortCommand = new SortCommand();
                sortCommand.execute();
            }

        }
    }









}
