package SpringWebProject;

public class Country {

    private String code;
    private String name;

    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Country Code : " + code);
        System.out.println("Country Name : " + name);
    }
}