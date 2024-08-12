import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static MongoDatabase todoDB;
    //create Lables and TextFields for todoApp
    static JLabel taskNamelb, taskDatelb, tasktimelb;
    static JTextField taskNametf, taskDatetf, tasktimetf;
    static JButton addTaskbt, deleteTaskbt, updateTaskbt, viewTaskbt;
    public static void main(String[] args) {
        //Add maven in your project
        //Create client and establish the mongo database connection
        var client = MongoClients.create("mongodb://localhost:27017/");
        //create or access the database
        todoDB = client.getDatabase("todoApp");
        //to create the collection
        //todoDB.createCollection("todoList");
        //create GUI for TodoApp using swing
        createTodoUI();
    }
    private static void createTodoUI() {
        JFrame frame = new JFrame("Todo App");

        //to initialize the UI components
        taskNamelb = new JLabel("Enter the task name");
        taskDatelb = new JLabel("Enter the task date");
        tasktimelb = new JLabel("Enter the task time");

        taskNametf = new JTextField();
        taskDatetf = new JTextField();
        tasktimetf = new JTextField();

        addTaskbt = new JButton("Add Task");
        deleteTaskbt = new JButton("Delete Task");
        updateTaskbt = new JButton("Update Task");
        viewTaskbt = new JButton("View Task");

        //to set the size and position of UI components
        taskNamelb.setBounds(50, 50, 150, 40);
        taskDatelb.setBounds(50, 80, 150, 40);
        tasktimelb.setBounds(50, 110, 150, 40);

        taskNametf.setBounds(180, 50, 120, 30);
        taskDatetf.setBounds(180, 80, 120, 30);
        tasktimetf.setBounds(180, 110, 120, 30);
        addTaskbt.setBounds(10, 150, 100, 30);
        deleteTaskbt.setBounds(110, 150, 100, 30);
        updateTaskbt.setBounds(210, 150, 100, 30);
        viewTaskbt.setBounds(310, 150, 100, 30);
        //to attach the UI components into frame
        frame.add(taskNamelb);
        frame.add(taskDatelb);
        frame.add(tasktimelb);
        frame.add(taskNametf);
        frame.add(taskDatetf);
        frame.add(tasktimetf);
        frame.add(addTaskbt);
        frame.add(deleteTaskbt);
        frame.add(viewTaskbt);
        frame.add(updateTaskbt);
        //to set the size of frame
        frame.setSize(450, 300);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setVisible(true);

        //to click on the add task button
        addTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //insert data into mongo db
                insertTaskIntoDB();
            }
        });

        //to update the task
        updateTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //update task
                updateTask();
            }
        });

        //to delete the task
        deleteTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //delete the task
                deleteTask();
            }
        });

        //to view the task
        viewTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to access the task
                viewTask();
            }
        });

    }

    private static void viewTask() {

        String taskID = JOptionPane.showInputDialog(null, "Enter Task id to view");
        var todoCollection = todoDB.getCollection("todoList");
        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("taskId", Integer.parseInt(taskID));
        FindIterable<Document> cursor = todoCollection.find(whereQuery);
        //to show the document into components
        taskNametf.setText(String.valueOf(cursor.iterator().next().get("taskName")));
        taskDatetf.setText(String.valueOf(cursor.iterator().next().get("taskDate")));
        tasktimetf.setText(String.valueOf(cursor.iterator().next().get("taskTime")));


    }

    private static void deleteTask() {
        //to access the collection
        var todoCollection = todoDB.getCollection("todoList");
        String deletetaskId = JOptionPane.showInputDialog(null,
                "Enter task id to delete the task");
        todoCollection.deleteOne(new Document("taskId", Integer.parseInt(deletetaskId)));
    }

    private static void updateTask() {
        //to access the collection
        var todoCollection = todoDB.getCollection("todoList");
        //to update the task status

        String taskId = JOptionPane.showInputDialog(null, "Enter task id to update status");
//        todoCollection.updateOne(new Document("taskId", Integer.parseInt(taskId)),
//                    new Document("$set", new Document("taskStatus", true)));


    }

    private static void insertTaskIntoDB() {
        //to access the collection
        var todoCollection = todoDB.getCollection("todoList");
        //to create the document and add in collection
        var random = new Random();
        var document = new Document();
        //add data into document
        document.append("taskName", taskNametf.getText());
        document.append("taskDate", taskDatetf.getText());
        document.append("taskTime", tasktimetf.getText());
        document.append("taskStatus", false);
        document.append("taskId", random.nextInt(999));
        //to add the document into collection
        todoCollection.insertOne(document);
        JOptionPane.showMessageDialog(null, "Task Added Successfully");
        //clear the form
        clearForm();
    }



    private static void clearForm() {
        taskDatetf.setText("");
        tasktimetf.setText("");
        taskNametf.setText("");
    }
}