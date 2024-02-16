import java.sql.SQLOutput;

public class Person {

    private String name;
    private String surname;
    private String email;

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public void personinfo(){
        System.out.printf("Person information \nName: %s\nSurname: %s\nEmail: %s",name,surname,email);
    }
}
