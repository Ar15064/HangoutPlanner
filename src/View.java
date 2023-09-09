import java.util.Scanner;

public class View{

    public static void menu(){
        System.out.println("1.Update Time");
        System.out.println("2.Generate Best Time");
        System.out.println("3.View Time");
        System.out.println("4.Exit");
    }

    // public static void addingUsers() {
    //     DataManager dataManager = new DataManager();
    //     for (int i = 0; i < 11; i++) {
    //         dataManager.addUser(new Users("Alek " + i, "Ramirez "+i,i,"10:1" + i));
    //     }
    // }

    public static Users addingUsers() {
        DataManager dataManager = new DataManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your last name : ");
        String lastName = scanner.nextLine();
         System.out.println("Enter your id : ");
        int  id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your time : ");
        String time = scanner.nextLine();

        // type in name last name id and time

        dataManager.addUser(new Users(name,lastName,id,time));

        

        return dataManager.getUser(name, lastName);
    }

    public static void main(String[] args) {
        Users user1 = new Users("Alek","Ramirez",1,"9:10");
        DataManager dataManager = new DataManager();
        Scanner in = new Scanner(System.in);
        int choice;


        for(int i = 0; i<11;i++){
            addingUsers();
        }

        System.out.println("WELCOME TO THE HANGOUT PLANNER");

        while(true){
            menu();
            System.out.print("Enter your choice : ");
            choice = in.nextInt();

            switch(choice){
                case 1:
                    for(int i = 0; i<dataManager.usersList.size();i++){
                        dataManager.updateTime(dataManager.userList(i));
                    }

                    
                    System.out.println("Time has been updated");
                    break;
                case 2:
                    System.out.println("Here is the best time");
                    break;
                case 3:
                    System.out.println("All user time");
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
