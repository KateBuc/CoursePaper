package derivative;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CreateCommand implements Command {
    private JTextField txtName1 = new JTextField(10);
    private JTextField txtName2 = new JTextField(10);
    private JTextField txtName3 = new JTextField(10);
    private JTextField txtName4 = new JTextField(10);
    private JButton btn = new JButton("Save");
    @Override
    public void execute()  {

        JFrame window1 = new JFrame("Creating derivative");
        window1.setSize(500,300);

        JPanel panel1 = new JPanel(new GridBagLayout());

        window1.getContentPane().add(panel1);

        GridBagConstraints constraints1 = new GridBagConstraints();


        constraints1.anchor = GridBagConstraints.FIRST_LINE_START;
        constraints1.gridx = 1;
        constraints1.gridy = 2;
        panel1.add(new JLabel("Full name of customer:  "),constraints1);
        constraints1.gridy++;
        panel1.add(new JLabel("Full name of seller:  "),constraints1);
        constraints1.gridy++;
        panel1.add(new JLabel("Name of item:  "),constraints1);
        constraints1.gridy++;
        panel1.add(new JLabel("Cost of item:  "),constraints1);
        constraints1.gridx = 2;
        constraints1.gridy = 2;



        panel1.add(txtName1,constraints1);
        constraints1.gridy++;


        panel1.add(txtName2,constraints1);
        constraints1.gridy++;


        panel1.add(txtName3,constraints1);
        constraints1.gridy++;


        panel1.add(txtName4,constraints1);

        constraints1.gridy++;

        panel1.add(btn,constraints1);

        window1.setVisible(true);

        CreateCommand.eventHandler eventHandler1 = new CreateCommand.eventHandler();

        btn.addActionListener(eventHandler1);
        window1.setVisible(true);

    }

    public class eventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event1) {
            if (event1.getSource() == btn) {
                String custName = "";
                String sellerName = "";
                String itemName =  "";
                double cost = 0.0;

                custName = txtName1.getText().trim();
                sellerName = txtName2.getText().trim();
                itemName = txtName3.getText().trim();
                cost = Double.parseDouble(txtName4.getText());

                DataBaseHandler DBHandler = new DataBaseHandler();

                DBHandler.writeDataToDB(custName,sellerName,itemName,cost);

                Derivative derivative1 = new Derivative(custName,sellerName,itemName,cost);
            }
        }

    }

}
