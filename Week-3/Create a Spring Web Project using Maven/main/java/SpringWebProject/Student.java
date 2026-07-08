package SpringWebProject;

public class Student {

    private int id;
    private String name;

    public Student() {
        System.out.println("Default Constructor Called");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor Injection");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}