package OOPS;

//it is data binding using methods
public class EncapsulationJava {
    public static void main(String[] args) {
        //to print the trainer profile
        Trainers trainers = new Trainers();
        //1. data add using object and reference
//        trainers.name = "Pawan Sharma";
//        trainers.email = "pawan@gmail.com";
//        trainers.technology = "JAVA";
//
//        System.out.println(trainers.name
//                + " "+trainers.email + " "+
//                trainers.technology);

        //2. data add using object and methods
        trainers.printProfile("pawan sharma",
                "p@gmail.com", "JAVA");

        //3. data add using encapsulation
        //add the data using getter and setter
        trainers.setName("Suraj");
        trainers.setEmail("s@gmail.com");
        trainers.setTechnology("JAVA");

        System.out.println(trainers.getName()
                + trainers.getEmail() + trainers.getTechnology());
    }
}

class Trainers{
    private String name;
    private String email;
    private String technology;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void printProfile(String pawanSharma,
                             String mail, String java) {
        System.out.println(pawanSharma + mail + java);
    }
}
