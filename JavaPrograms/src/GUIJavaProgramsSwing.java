import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIJavaProgramsSwing {
    public static void main(String[] args) {

        bmiCalculator();

    }

    private static void bmiCalculator() {
        //to create a frame using swing in java
        JFrame frame = new JFrame("BMI Calculator");

        //create UI components for BMI calculation
        JLabel heightLabel = new JLabel("Enter your Height(m):");
        JLabel weightLabel = new JLabel("Enter your Weight(kg):");
        JLabel bmiLabel = new JLabel();

        JTextField weightField = new JTextField();
        JTextField heightField = new JTextField();

        JButton bmiButton = new JButton("Calculate BMI");
        //to set the size and position of UI components
        heightLabel.setBounds(30, 30,150, 40);
        heightField.setBounds(170, 30, 50, 40);
        weightLabel.setBounds(30, 80, 150, 40);
        weightField.setBounds(170, 80, 50, 40);
        bmiButton.setBounds(30, 130, 120, 40);
        bmiLabel.setBounds(170, 130, 100, 40);
        //to attach the lable to frame
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(bmiButton);
        frame.add(bmiLabel);
        //to build the default layout
        frame.setLayout(null);
        //to set the size for frame
        frame.setSize(300, 250);
        //to visible the frame on screen
        frame.setVisible(true);

        //to click on the bmi calculate button
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to apply the bmi formula
                float weight = Float.parseFloat(weightField.getText());
                float height = Float.parseFloat(heightField.getText());

                float output = weight/(height * height);
                //18.5 < under weight , 18.5 to 24.9 = normal, 24.9 to 29.9 overweight, 29 > obesity
                if ( output < 18.5)
                {
                    bmiLabel.setText("Im under weight");
                } else if (output > 18.5 && output < 24.9) {
                    bmiLabel.setText("Im normal");
                } else if (output > 24.9 && output < 29.9) {
                    bmiLabel.setText("Im overweight");
                }else {
                    bmiLabel.setText("Im obesity");
                }
            }
        });

    }
}
