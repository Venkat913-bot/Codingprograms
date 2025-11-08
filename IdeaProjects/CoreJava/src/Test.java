import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<User> userInfo = new ArrayList<User>();

       userInfo.add(new User(2,"venkat", "denton"));
       userInfo.add(new User(1, "balu", "Hyderabad"));
       userInfo.add(new User(4,"suresh",  "USA"));
       userInfo.add(new User(3,"harish", "Network"));

        User user = userInfo.get(3);
        System.out.println(user);

        int user_Id = userInfo.indexOf("suresh");

        int user_Id1 = -1;
        for (int i = 0; i < userInfo.size(); i++) {
            if (userInfo.get(i).getUser_name().equals("suresh")) {
                user_Id = i;
                break;
            }
        }
        System.out.println("Index of suresh: " + user_Id);





    }

    
}
