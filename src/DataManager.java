import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {

    ArrayList<Users> usersList;
    ArrayList<String> userTime;
    public Object userList;

    static int count = 0;

    DataManager() {
        usersList = new ArrayList<>();
        userTime = new ArrayList<>();
    }

    public void addUser(Users newUser) {
        if(checkSize() == false) {count++;
            usersList.add(newUser);}
 
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



    public void updateTime(Users currentUser) {
        String oldTime = currentUser.getTime();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new time: ");
        currentUser.time = input.nextLine();
        System.out.println(oldTime + " this is old time");
        System.out.println(currentUser.getTime() + " new time");
    }

    

    public void sortUsers() {
        // what to use ? if we want to sort them
    }
}
