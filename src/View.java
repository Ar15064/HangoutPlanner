import javax.xml.crypto.Data;
import java.util.Scanner;

public class View{

    public static void menu(){
        System.out.println("1.Add Time");
        System.out.println("2.Update Time");
        System.out.println("3.View all user Time");
        System.out.println("4.Generate best time");
        System.out.println("5.Exit");
    }

    // public static void addingUsers() {
    //     DataManager dataManager = new DataManager();
    //     for (int i = 0; i < 11; i++) {
    //         dataManager.addUser(new Users("Alek " + i, "Ramirez "+i,i,"10:1" + i));
    //     }
    // }

//    public static void addingUsers(DataManager dataManager) {
//          DataManager dataManager
//        Scanner scanner = new Scanner(System.in);
//        for(int i= 0; i<1;i++){
//            System.out.println("ADDING NEW USER");
//            System.out.println("Enter your name : ");
//            String name = scanner.nextLine();
//            System.out.println("Enter your last name : ");
//            String lastName = scanner.nextLine();
//            System.out.println("Enter your id : ");
//            int  id = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Enter your time : ");
//            String time = scanner.nextLine();
//            System.out.println("User with id " + id+ " was added.");
//            Users newUser = new Users(name,lastName,id,time);
//            dataManager.usersList.add(newUser);
//
//        }


//        return dataManager.getUser(name, lastName);

        // type in name last name id and time


//    }

    public static void main(String[] args) {

        //Hardcoded some values for us to test
        Users user1 = new Users("Alek","Ramirez",1);
        Users user2 = new Users("Zeshan","Merchant",2);
        Users user3 = new Users("Jackson","Jonas",3);
        Users user4 = new Users("Sub","Roza",4);
        DataManager dataManager = new DataManager();
        Scanner in = new Scanner(System.in);
        int choice;
        int userID;

        //adding user in arrayList using your method addUser
        dataManager.addUser(user1);
        dataManager.addUser(user2);
        dataManager.addUser(user3);
        dataManager.addUser(user4);




        //Uncomment this to see that the users are added successfully.

//        for (int i = 0; i<dataManager.usersList.size();i++){
//            System.out.println(dataManager.usersList.get(i).getId());
//            System.out.println(dataManager.usersList.get(i).getName());
//            System.out.println(dataManager.usersList.get(i).getLastName());
//            System.out.println(dataManager.usersList.get(i).getTime());
//        }

        System.out.println("WELCOME TO THE HANGOUT PLANNER");

        while(true){
            menu();
            System.out.print("Enter your choice : ");
            choice = in.nextInt();

            switch(choice){
                case 1:
                    //ADD TIME
//                    for(int i = 0; i<dataManager.usersList.size();i++){
//                        DataManager.updateTime(dataManager.usersList.get(i));
//                    }
                    System.out.print("Enter the user ID to add time : ");
                    userID = in.nextInt();
                    DataManager.addTime(userID);
                    break;
                case 2:
                    System.out.print("Enter the user ID to update time : ");
                    userID = in.nextInt();
                    DataManager.updateTime(userID);
                    break;
                case 3:
                    System.out.println("Here is all user time");
                    dataManager.viewTime();
                    break;
                case 4 :
                    System.out.println("Here is the best time");
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
