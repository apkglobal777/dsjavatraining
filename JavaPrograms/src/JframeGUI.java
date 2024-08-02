import javax.swing.*;
import java.awt.*;

public class JframeGUI {
    public static void main (String[] args){
        System.out.println("Jframe is used to build GUI Java application");
        JFrame jframe = new  JFrame("BMI Calculator");

        //to get input from user JTextField
        //to display any message to user JLabel
        //to perform any action by click the button JButton

        JLabel userWeightLabel = new JLabel("Enter your weight in kg");
        userWeightLabel.setBounds(40,40,200,40);
        JTextField userWeightField = new JTextField("");
        userWeightField.setBounds(250,100,60,40);

        JLabel userheightLabel = new JLabel("Enter your height in m");
        userheightLabel.setBounds(40,100,200,40);
        JTextField userHeightField = new JTextField("");
        userHeightField.setBounds(250,100,60,40);

        JButton calculatorbmi =new JButton("calculate BMI");
        calculatorbmi.setBounds(250,250,150,50);
        jframe.add(calculatorbmi);


        //logic bmi calculator user height in m and user weight in kg
        //formula weight/(height * weight)
        //to use default layout
        jframe.add(userWeightLabel);
        jframe.add(userheightLabel);


        jframe.setLayout(null);
        //to add the size in frame
        jframe.setSize(400,300);
        //set visible the frame
        jframe.setVisible(true);
    }
}
