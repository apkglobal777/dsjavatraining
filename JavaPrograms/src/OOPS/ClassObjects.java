package OOPS;

import java.util.Scanner;

public class ClassObjects {
    public static void main(String[] args) {
        //print the trainer name, technology
        //print the student name, technology
        Trainer trainer = new Trainer();
        trainer.trainerName = "Pawan Sharma";
        trainer.trainerTechnology = "JAVA";


        //to call the method of trainer class to print profile
        trainer.printTrainerProfile(trainer.trainerName,trainer.trainerTechnology );

//        System.out.println("My name is : "+ trainer.trainerName+
//                " my technology is: "+ trainer.trainerTechnology);

        Student student = new Student();
        System.out.println("Enter the student name: ");
        Scanner scanner = new Scanner(System.in);
        student.studentName = scanner.nextLine();
        System.out.println("Enter the enrolled technology: ");
        student.studentEnrolledTechnology = scanner.nextLine();

        System.out.println("Enter no of days");
        int days = scanner.nextInt();
        int hours = trainer.noOfHoursCompleted(days);
        System.out.println("Total completed hours"+ hours);
    }
}

class Trainer{
    String trainerName;
    String trainerTechnology;

    void printTrainerProfile(String name, String technology){
        System.out.println(name + technology);
    }

    int noOfHoursCompleted(int noOfDays){
        int hours = noOfDays * 3;
        return hours;
    }
}

class Student{
    String studentName;
    String studentEnrolledTechnology;
}
