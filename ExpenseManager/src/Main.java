import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//pass the database the url,username, password in string
String url="jdbc:mysql://localhost:3310/expencedb";
String user="root";
String password="";

        try
        {
            Connection con= DriverManager.getConnection(url,user,password);

            System.out.println("Connected");

            //Design the java UI for expence Calculator
            JFrame frame=new JFrame("Vibha Expences ");

            JLabel titlelabel=new JLabel("Expences");
            titlelabel.setBounds(210,10,80,50);
            titlelabel.setForeground(Color.BLUE);
            frame.add(titlelabel);

            JLabel expencetypelabel=new JLabel("Enter Expences Type");
            expencetypelabel.setBounds(20,50,150,50);
            expencetypelabel.setForeground(Color.RED);
            frame.add(expencetypelabel);

            JTextField expencetypefield=new JTextField();
            expencetypefield.setBounds(170,60,100,30);
            frame.add(expencetypefield);

            JLabel expenceamountlabel=new JLabel("Enter Expence amount");
            expenceamountlabel.setBounds(20,80,170,50);
            expenceamountlabel.setForeground(Color.RED);
            frame.add(expenceamountlabel);

            JTextField expenceamoutfield=new JTextField();
            expenceamoutfield.setBounds(170,90,100,30);
            frame.add(expenceamoutfield);

            JLabel incomeamountlabel=new JLabel("Enter Income amount");
            incomeamountlabel.setBounds(20,110,170,50);
            incomeamountlabel.setForeground(Color.RED);
            frame.add(incomeamountlabel);

            JTextField incomeamoutfield=new JTextField();
            incomeamoutfield.setBounds(170,120,100,30);
            frame.add(incomeamoutfield);

            JButton savebutton=new JButton("Save");
            savebutton.setBounds(210,200,80,40);
            frame.add(savebutton);

            //to click on the save button
            savebutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //To insert the data into table.
                    String insert="insert into expencetb(incomeamount,expencetype,expenceamount) values(?,?,?)";
                    PreparedStatement ps= null;
                    try {
                        ps = con.prepareStatement(insert);
                        ps.setInt(1, Integer.parseInt(incomeamoutfield.getText()));
                        ps.setString(2,expencetypefield.getText());
                        ps.setInt(3, Integer.parseInt(expenceamoutfield.getText()));
                        ps.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            });





            frame.setSize(500,400);
            frame.setLayout(null);
            frame.setVisible(true);


        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }


    }
}