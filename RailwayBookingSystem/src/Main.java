import javax.swing.*;
import java.awt.*;
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
//store the url,username,password in string object of database
        String url="jdbc:mysql://localhost:3310/Railwaybookingdb";
        String username="root";
        String password="";



        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            System.out.println("Db connected");

            JFrame frame=new JFrame("Railway Booking System");

            JLabel personal_label=new JLabel("Personal Details");
            personal_label.setBounds(10,10,120,30);
            frame.add(personal_label);

            JLabel ticket_details_label=new JLabel("Ticket Details");
            ticket_details_label.setBounds(310,10,120,30);
            frame.add(ticket_details_label);

            JLabel username_label=new JLabel("Add Username");
            username_label.setBounds(10,50,120,30);
            frame.add(username_label);

            JTextField username_field=new JTextField();
            username_field.setBounds(130,50,100,30);
            frame.add(username_field);

            JLabel date_of_journey_label=new JLabel("Date Of Journey");
            date_of_journey_label.setBounds(310,50,120,30);
            frame.add(date_of_journey_label);

            JTextField date_of_journey_field=new JTextField();
            date_of_journey_field.setBounds(430,50,100,30);
            frame.add(date_of_journey_field);


            JLabel age_label=new JLabel("Add Age");
            age_label.setBounds(10,80,120,30);
            frame.add(age_label);

            JTextField age_field=new JTextField();
            age_field.setBounds(130,80,100,30);
            frame.add(age_field);

            JLabel source_label=new JLabel("Source");
            source_label.setBounds(310,80,120,30);
            frame.add(source_label);

            JTextField source_field=new JTextField();
            source_field.setBounds(430,80,100,30);
            frame.add(source_field);


            JLabel gender_label=new JLabel("Add Gender");
            gender_label.setBounds(10,110,120,30);
            frame.add(gender_label);

            JTextField gender_field=new JTextField();
            gender_field.setBounds(130,110,100,30);
            frame.add(gender_field);

            JLabel destination_label=new JLabel("Enter Destination");
            destination_label.setBounds(310,110,120,30);
            frame.add(destination_label);

            JTextField destination_field=new JTextField();
            destination_field.setBounds(430,110,100,30);
            frame.add(destination_field);

            JLabel email_label=new JLabel("Add Email:");
            email_label.setBounds(10,140,120,30);
            frame.add(email_label);

            JTextField email_field=new JTextField();
            email_field.setBounds(130,140,100,30);
            frame.add(email_field);

            JLabel ticket_price_label=new JLabel("Enter Ticket Price:");
            ticket_price_label.setBounds(310,140,120,30);
            frame.add(ticket_price_label);

            JTextField ticket_price_field=new JTextField();
            ticket_price_field.setBounds(430,140,100,30);
            frame.add(ticket_price_field);

            JLabel mobile_label=new JLabel("Add Mobile:");
            mobile_label.setBounds(10,170,120,30);
            frame.add(mobile_label);

            JTextField mobile_field=new JTextField();
            mobile_field.setBounds(130,170,100,30);
            frame.add(mobile_field);

            JLabel seat_label=new JLabel("Enter Seat Preference:");
            seat_label.setBounds(310,170,120,30);
            frame.add(seat_label);

            JTextField seat_field=new JTextField();
            seat_field.setBounds(440,170,100,30);
            frame.add(seat_field);




            frame.setSize(600,500);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.GRAY);


            // update the data in database.
            String updateQuery="update ticketbookingtb set username=?,gender=?,age=? where id=?";
            PreparedStatement ps =connection.prepareStatement(updateQuery);
            ps.setString(1,"Anjali");
            ps.setString(2,"female");
            ps.setInt(3,20);
            ps.setInt(4,2);
            ps.execute();
            System.out.println("Record has been updated");

            // delet the data form table
//            String deleteQuery="delete from ticketbookingtb where id=? ";
//            PreparedStatement ps =connection.prepareStatement(deleteQuery);
//            ps.setInt(1,3);
//            ps.execute();
//            System.out.println(" one record is deleted");
            //add booking info
//            String insertQuery="insert into ticketbookingtb(username,age,gender, mobile,email,doj,source,destination,ticketprice,seatpreference ) values(?,?,?,?,?,?,?,?,?,?)";
//            PreparedStatement ps=connection.prepareStatement(insertQuery);
//            ps.setString(1,"Pawan");
//            ps.setInt(2,34);
//            ps.setString(3,"male");
//            ps.setString(4,"8527657976");
//            ps.setString(5,"nitish@gmail.com");
//            ps.setString(6,"2/07/2024");
//            ps.setString(7,"Delhi");
//            ps.setString(8,"Goa");
//            ps.setString(9,"5100");
//            ps.setString(10,"window");
//            ps.execute();
            //System.out.println("your ticket booked");
            //

        } catch (SQLException e) {
            throw new RuntimeException(e);


        }
    }
}