import java.util.ArrayList;

public class Users {

    String name;
    String time;
    int id;

    Users(String name, String time, int id) {
        this.name = name;
        this.time = time;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

}
