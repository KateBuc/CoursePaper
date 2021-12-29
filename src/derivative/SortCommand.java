package derivative;

import obligations.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

import static derivative.Derivative.*;


public class SortCommand implements Command{

    private static Map<Integer, Obligations> obligations3;

    @Override
    public void execute() {

        JFrame window3 = new JFrame("Sorting obligations");
        window3.setSize(700, 350);


        JPanel panel3 = new JPanel(new GridBagLayout());

        window3.getContentPane().add(panel3);

        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.gridx = 0;
        constraints3.gridy = 0;



        String[] arrObligations = new String[6];
        Double[] PercentOfRisk = new Double[6];
        int i=0;


        obligations3 = new HashMap<>();
        obligations3 = getDerMap();
        TreeMap sortedNumbers = new TreeMap(obligations3);

        for (Object obj : sortedNumbers.values()) {
             Obligations obl = (Obligations) obj;
            PercentOfRisk[i] = obl.getPercentOfRisk();
            arrObligations[i] = obl.getObligations();

             i++;
        }

        JLabel[] arrOfLabelsObl = new JLabel[6];
        JLabel[] arrOfLabelsPer = new JLabel[6];
        for(int f=0;f<6;f++){
            arrOfLabelsObl[f] = new JLabel("");
            arrOfLabelsPer[f] = new JLabel("");

        }

        constraints3.anchor = GridBagConstraints.LINE_START;
        for(int t=0;t<6;t++){
            constraints3.gridy = t;
            constraints3.gridx = 0;
            panel3.add(arrOfLabelsPer[t], constraints3);
            constraints3.gridx = 1;
            panel3.add(arrOfLabelsObl[t], constraints3);

        }

        for(int k=0;k<6;k++){
            arrOfLabelsObl[k].setText(arrObligations[k]);
            arrOfLabelsPer[k].setText(String.valueOf(PercentOfRisk[k]));

        }

        window3.setVisible(true);
    }

}
