public class DataManager {

    ArrayList<Users> usersList;

    DataManager() {
        usersList = new ArrayList<>();
    }

    public void addUser(Users newUser) {
        if(checkSize() == false) usersList.add(newUser);

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

    public int getUser(String name) {
        for (int i = 0; i < usersList.size(); i++) {
            if(usersList.get(i).getName().equals( name)) return i;
        }

        return -1;
    }

    public String getUser(int id) {
        for (int i = 0; i < usersList.size(); i++) {
            if(usersList.get(i).getId() == id) return usersList.get(i).getName();
        }
        return "Not here";
    }

    public void toStringList() {
        for (int i = 0; i < usersList.size(); i++) {
            System.out.println(usersList.get(i).getName() + " "
            + usersList.get(i).getTime() + " " +
            usersList.get(i).getId());
        }
    }

    public void sortUsers() {
        // what to use ? if we want to sort them
    }
}
