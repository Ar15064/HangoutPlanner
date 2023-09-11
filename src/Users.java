import java.util.ArrayList;

public class Users {


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    //private variables is a good practice
    private String name;
    private String time;
    private String lastName;
    private int id;



    //Removed time parameter from constructor as we will set time using setter and addTime method.
    public Users(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;
    }

    public Users(String name, String lastName, int id) { // this new constructor will get called when users is called
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }


    public String getTime() {

        return time;
    }

    public void setTime(String time) {
        try{this.time = time;}catch (Exception e) {System.out.println("error");}

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }



}
