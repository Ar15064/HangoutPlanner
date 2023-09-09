import java.util.ArrayList;

public class Users {

    String name;
    String time;
    String lastName;
    int id;


    public String getTime() {

        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    Users(String name, String lastName, int id,String time) {
        this.time = time;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }



}
