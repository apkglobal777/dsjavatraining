public class InheritanceDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parentMethod();
        parent.grandParentMethod();
    }
}

class Parent extends GrandParent {

    void parentMethod() {
        System.out.println("Parent method");
    }
}

class GrandParent{

    void grandParentMethod() {
        System.out.println("GrandParent method");
    }
}
