package day2_1;

public class UserController {

    public static void main(String[] args) {

        UserService service = new UserService();
        service.fetchUsersAndSave();

        System.out.println("✅ Data inserted successfully!");
    }
}
