package derivative;

import javax.swing.*;
import java.awt.*;

import static derivative.Derivative.getCost;

public class PriceCommand implements Command{
    @Override
    public void execute() {
        JFrame window2 = new JFrame("Creating derivative");
        window2.setSize(300, 200);

        JPanel panel2 = new JPanel(new GridBagLayout());

        window2.getContentPane().add(panel2);

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        panel2.add(new JLabel("Total costs of derivative execution:  " + getCost() * 1.1), constraints2);
        constraints2.gridy++;
        window2.setVisible(true);


    }

}
