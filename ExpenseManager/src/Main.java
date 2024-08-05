import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //pass the database the url,username, password in string
    static JTextField deleteField;
    static String url="jdbc:mysql://localhost:3310/expencedb";
    static String user="root";
    static String password="";
    static Connection con;
    static JTextField expencetypefield, expenceamoutfield, incomeamoutfield;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //create frame for expense calculator
        createExpenseCalculcatorFrame();
    }

    private static void createExpenseCalculcatorFrame() {

        try
        {
            con= DriverManager.getConnection(url,user,password);

            System.out.println("Connected");

            //Design the java UI for expence Calculator
            JFrame frame=new JFrame("Vibha Expences ");

            JLabel titlelabel=new JLabel("Expences");
            titlelabel.setBounds(210,10,180,50);
            titlelabel.setForeground(Color.BLUE);
            frame.add(titlelabel);

            JLabel expencetypelabel=new JLabel("Enter Expences Type");
            expencetypelabel.setBounds(20,50,150,50);
            expencetypelabel.setForeground(Color.RED);
            frame.add(expencetypelabel);

            expencetypefield=new JTextField();
            expencetypefield.setBounds(170,60,100,30);
            frame.add(expencetypefield);

            JLabel expenceamountlabel=new JLabel("Enter Expence amount");
            expenceamountlabel.setBounds(20,80,170,50);
            expenceamountlabel.setForeground(Color.RED);
            frame.add(expenceamountlabel);

            expenceamoutfield=new JTextField();
            expenceamoutfield.setBounds(170,90,100,30);
            frame.add(expenceamoutfield);

            JLabel incomeamountlabel=new JLabel("Enter Income amount");
            incomeamountlabel.setBounds(20,110,170,50);
            incomeamountlabel.setForeground(Color.RED);
            frame.add(incomeamountlabel);

            incomeamoutfield=new JTextField();
            incomeamoutfield.setBounds(170,120,100,30);
            frame.add(incomeamoutfield);

            JButton savebutton=new JButton("Save");
            savebutton.setBounds(230,200,80,40);
            frame.add(savebutton);

            JButton deletebutton=new JButton("Delete");
            deletebutton.setBounds(150,200,80,40);
            frame.add(deletebutton);

            deletebutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (savebutton.isVisible())
                    {

                        //to hide the insert form
                        incomeamountlabel.setVisible(false);
                        incomeamoutfield.setVisible(false);
                        expenceamountlabel.setVisible(false);
                        expenceamoutfield.setVisible(false);
                        expencetypefield.setVisible(false);
                        expencetypelabel.setVisible(false);
                        savebutton.setVisible(false);
                        titlelabel.setText("Enter Id to delete Expense");
                        deleteField= new JTextField();
                        deleteField.setBounds(50, 60, 100, 40);
                        frame.add(deleteField);
                    }
                    else {
                       String deleteQuery = "delete from expencetb where id = ?";
                        try {
                            PreparedStatement ps = con.prepareStatement(deleteQuery);
                            ps.setInt(1, Integer.parseInt(deleteField.getText()));
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null,
                                    "Record has been deleted");
                            expencetypelabel.setVisible(true);
                            expenceamountlabel.setVisible(true);
                            expencetypefield.setVisible(true);
                            expenceamoutfield.setVisible(true);
                            savebutton.setVisible(true);
                            incomeamountlabel.setVisible(true);
                            incomeamoutfield.setVisible(true);
                            deleteField.setVisible(false);
                            titlelabel.setText("Expense Calculator");
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                }
            });

            JButton viewbutton=new JButton("View");
            viewbutton.setBounds(320,200,80,40);
            frame.add(viewbutton);

            viewbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (savebutton.isVisible())
                    {

                        //to hide the insert form
                        incomeamountlabel.setVisible(false);
                        incomeamoutfield.setVisible(false);
                        expenceamountlabel.setVisible(false);
                        expenceamoutfield.setVisible(false);
                        expencetypefield.setVisible(false);
                        expencetypelabel.setVisible(false);
                        savebutton.setVisible(false);
                        titlelabel.setText("Enter Id to udpate Expense");
                        deleteField= new JTextField();
                        deleteField.setBounds(50, 60, 100, 40);
                        frame.add(deleteField);
                    }
                    else {
                        String deleteQuery = "Select * from expencetb where id = ?";
                        try {
                            PreparedStatement ps = con.prepareStatement(deleteQuery);
                            ps.setInt(1, Integer.parseInt(deleteField.getText()));
                            ResultSet rs = ps.executeQuery();
                            while (rs.next())
                            {
                                System.out.print("ID: " + rs.getInt("id"));
                                System.out.print("Income amount: " + rs.getInt("incomeamount"));
                                System.out.print("Expense Type: " + rs.getString("expencetype"));
                                System.out.print("Expense Amount: " + rs.getInt("expenceamount"));
                                incomeamoutfield.setText(String.valueOf(rs.getInt("incomeamount")));
                                expenceamoutfield.setText(String.valueOf(rs.getInt("expenceamount")));
                                expencetypefield.setText(rs.getString("expencetype"));

                                JButton updateButton = new JButton("Update");
                                updateButton.setBounds(380,200,80,40);
                                frame.add(updateButton);
                                updateButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String updateQuery = "update expencetb set incomeamount = ?, expencetype = ?, expenceamount = ? where id = ?";
                                        try {
                                            PreparedStatement ps = con.prepareStatement(updateQuery);
                                            ps.setInt(1, Integer.parseInt(incomeamoutfield.getText()));
                                            ps.setString(2, expencetypefield.getText());
                                            ps.setInt(3, Integer.parseInt(expenceamoutfield.getText()));
                                            ps.setInt(4, 31);
                                            ps.executeUpdate();
                                        } catch (SQLException ex) {
                                            throw new RuntimeException(ex);
                                        }

                                    }
                                });
                            }
                            JOptionPane.showMessageDialog(null,
                                    "Record has been deleted");
                            expencetypelabel.setVisible(true);
                            expenceamountlabel.setVisible(true);
                            expencetypefield.setVisible(true);
                            expenceamoutfield.setVisible(true);
                            savebutton.setVisible(true);
                            incomeamountlabel.setVisible(true);
                            incomeamoutfield.setVisible(true);
                            deleteField.setVisible(false);
                            titlelabel.setText("Expense Calculator");
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                }
            });

            JButton clearbutton=new JButton("Clear");
            clearbutton.setBounds(50,200,80,40);
            frame.add(clearbutton);

            clearbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //to clear the form
                    clearForm();

                }
            });

            //to click on the save button
            savebutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //To insert the data into table.
                    insertExpenseIntoDB();

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

    private static void insertExpenseIntoDB() {
        String insert="insert into expencetb(incomeamount,expencetype,expenceamount) values(?,?,?)";
        PreparedStatement ps= null;
        try {
            ps = con.prepareStatement(insert);
            ps.setInt(1, Integer.parseInt(incomeamoutfield.getText()));
            ps.setString(2,expencetypefield.getText());
            ps.setInt(3, Integer.parseInt(expenceamoutfield.getText()));
            ps.executeUpdate();

            //to clear the form after submit data to mysql
            clearForm();

            JOptionPane.showMessageDialog(null,
                    "Record has been added");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void clearForm() {
        expencetypefield.setText("");
        expenceamoutfield.setText("");
        incomeamoutfield.setText("");
    }
}