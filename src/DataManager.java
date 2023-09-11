import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {

    static Scanner in = new Scanner(System.in);
    static ArrayList<Users> usersList;
    public Object userList;

    static int count = -1;

    DataManager() {
        usersList = new ArrayList<>();

    }





    public void addUser(Users newUser) {
        if(checkSize() == false) {count++;  System.out.println(count);
            this.usersList.add(new Users(newUser.getName(),newUser.getLastName(),count));}
        // we are going to make a new user but using constructor that doenst have and id
        // the id will be count. the count starts at -1 so when running it starts at 0

        else System.out.println("users are full");

    }

    public void removeUser(int id) {
        for (int i = 0; i < usersList.size(); i++) {
            if(usersList.get(i).getId() == id) usersList.remove(i);
        }
    }

    public boolean checkSize() {
        if(usersList.size() >= 10) return true;
        return false;
    }

    public int checkRealSize() {

        return usersList.size();
    }

    public Users getUser(String name, String lastName) {
        int j = 0;
        for (int i = 0; i < usersList.size() - 1; i++) {
            if(usersList.get(i).getName().equals(name) && usersList.get(i).getLastName().equals(lastName)) j = i;
        }

        return usersList.get(j);
    }

    public Users getUser(int id) {

        for (int i = 0; i < usersList.size(); i++) {
            if(usersList.get(i).getId() == id) return usersList.get(i);
        }
        return null;
    }

    public void toStringList() {
        for (int i = 0; i < usersList.size(); i++) {
            System.out.println(usersList.get(i).getName() + " " +
                    usersList.get(i).getId());
        }
    }





    public static void updateTime(int id) {
        try {
            boolean userFound = false;
            String newTime;
            for (int i = 0; i < usersList.size(); i++) {
                if (usersList.get(i).getId() == id && usersList.get(i).getTime() != null) {
                    String oldTime = usersList.get(i).getTime();
                    System.out.println("Enter the new time : ");
                    newTime = in.nextLine();
                    if(validTime(newTime) == true){
                    usersList.get(i).setTime(newTime);
                    System.out.println("Old time " + oldTime);
                    System.out.println("New time " + newTime);
                    userFound = true;
                    break;} else break;
                }
            }

            if (userFound) {
                System.out.println("Time has been updated");
            } else {
                System.out.println("User not found or no time added");
            }
        } catch (Exception e) {System.out.println("error");}
    }


    /*ADD TIME METHOD
      This method takes a user id and if that id is found in the array list, it will add the time else it will print
      user not found.
      * */
    public  static void addTime(int id){
        boolean userFound = false;
        String time;
        for(int i = 0; i< usersList.size(); i++){


            if(usersList.get(i).getId()==id){
                System.out.println("Enter the time to add : ");
                time = in.nextLine();
                if(validTime(time) == true){
                usersList.get(i).setTime(time);
                System.out.println(usersList.get(i).getTime());
                userFound = true;
                break;}

                else break;
            }

        }
        if(userFound){
            System.out.println("Time has been added");
        } else{
            System.out.println("User not found");
        }
    }

    public static boolean validTime(String time) { // checks if the time is valid
        int count = 0;
        try{
        for (int i = 0; i < time.length(); i++) {
            if(i == 2);
            else {
                if(Integer.parseInt(String.valueOf(time.charAt(0))) >= 0) count++;
            }
        }

        if(count == 3 || count == 4) return true;

        return false;}

        catch (Exception e) {System.out.println("error"); return false;}
    }


    public void viewTime(){
        for(int i = 0; i< usersList.size(); i++){
            if(usersList.get(i).getTime()==null){
                System.out.println(usersList.get(i).getName() + " has not added a time yet");
            } else{
                System.out.println(usersList.get(i).getName() + "'s time is " + usersList.get(i).getTime());
            }
        }
    }

    public String bestTime(ArrayList<Users> usersList) {
        int store = 0;
        int store1 = 0;
        for (int i = 0; i < usersList.size(); i++) {
            for (int j = 1; j < usersList.size(); j++) {

            }
        }


        return "Try again";
    }

    public void sortUsers() {
        // what to use ? if we want to sort them
    }
}
