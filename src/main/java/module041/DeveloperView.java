package module041;


import java.io.IOException;
import java.util.Scanner;

/**
 * Created by IGOR.LAZNIUK on 20.07.2017.
 */
public class DeveloperView {
    public int input;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        startMenu();
    }


    public static void startMenu() throws IOException, ClassNotFoundException {


        while (true) {
            System.out.println("========== MENU ========\n"
                    + "1. Create developer;\n"
                    + "2. Edit developer;\n"
                    + "3. View developer;\n"
                    + "4. Delete developer\n"
                    + "5. Exit");
            menuLogic();
        }
    }

    public static void menuLogic() throws IOException, ClassNotFoundException {
        DeveloperController developerController = new DeveloperController();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int id;
        switch (input) {
            case 1:
                System.out.println("Enter ID");
                id = sc.nextInt();
                Developer developer = new Developer(id);
                developerController.add(developer);
                //developerController.add(new Developer(id));

                break;
            case 2:
                System.out.println("Enter ID to edit");
                id = sc.nextInt();
                int newId;
                System.out.println("Enter new ID");
                newId = sc.nextInt();
                developerController.edit(new Developer(id), new Developer(newId));
                ;
                break;
            case 3:
                System.out.println(developerController.view());
                break;
            case 4:
                System.out.println("Enter ID");
                id = sc.nextInt();
                developerController.delete(new Developer(id));
                break;


            case 5:
                System.exit(0);
                break;

            default:
                System.out.println("Please try again");

                break;
        }
    }


}
