package OOPS;

//to print the student info
public class EncapsulationExample {
    public static void main(String[] args) {
        //add the student info
        StudentProfile s = new StudentProfile();
        s.setName("ARVIND");
        s.setEmail("a@gmail.com");
        s.setAddress("Lucknow");
        s.setMobile("8527657955");
        //get and print the student info
        System.out.println(s.getName() +
                s.getEmail() + s.getMobile()
        + s.getAddress());
    }
}

class StudentProfile {
    String name;
    String email;
    String address;
    String mobile;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
