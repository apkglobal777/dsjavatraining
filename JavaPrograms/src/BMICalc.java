import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalc {
    public static void main(String[] args) {
       //calculate the user bmi
        //create jFrame object for frame design
        JFrame frame = new JFrame("BMI Calculator");

        //lable to display text msg to user
        JLabel heightLabel = new JLabel("Enter your height (m) :");
        JLabel weightLabel = new JLabel("Enter your weight (Kg) :");
        JTextField heightField = new JTextField();
        JTextField weightField = new JTextField();
        JButton bmiButton = new JButton("Calculate BMI");
        JLabel resultLabel = new JLabel();

        //to set the size and position of UI components in frame
        heightLabel.setBounds(30, 30, 150, 40);
        heightField.setBounds(180, 30, 50, 40);
        weightLabel.setBounds(30, 70, 150, 40);
        weightField.setBounds(180, 70, 50, 40);
        bmiButton.setBounds(90, 120, 120, 40);
        resultLabel.setBounds(30, 170, 250, 40);
        //to attach the UI components to frame
        frame.add(resultLabel);
        frame.add(bmiButton);
        frame.add(weightField);
        frame.add(weightLabel);
        frame.add(heightLabel);
        frame.add(heightField);
        //to set layout null
        frame.setLayout(null);
        //to add the size in frame
        frame.setSize(300, 250);
        //to visible the frame
        frame.setVisible(true);

        //to click on the calculate BMI button
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add validation in height and weight, values can't be empty
                if (heightField.getText().isEmpty() || weightField.getText().isEmpty())
                {
                    resultLabel.setText("Please enter the weight and height");
                }
                else {
                    float height = Float.parseFloat(heightField.getText());
                    float weight = Float.parseFloat(weightField.getText());

                    float result = weight/(height * height);

                    //18.5 < under weight , 18.5 to 24.9 = normal, 24.9 to 29.9 overweight, 29 > obesity
                    if (result < 18.5)
                    {
                        resultLabel.setText("Im under weight");
                        resultLabel.setBackground(Color.RED);
                        resultLabel.setForeground(Color.RED);
                    } else if (result > 18.5 && result < 24.9 ) {
                        resultLabel.setText("Im normal");
                        resultLabel.setBackground(Color.GREEN);
                        resultLabel.setForeground(Color.GREEN);
                    } else if (result > 24.9 && result < 29.9) {
                        resultLabel.setText("Im over weight");
                        resultLabel.setBackground(Color.YELLOW);
                        resultLabel.setForeground(Color.YELLOW);
                    }else {
                        resultLabel.setText("Im obesity");
                        resultLabel.setBackground(Color.RED);
                        resultLabel.setForeground(Color.RED);
                    }
                }

            }
        });

    }
}
