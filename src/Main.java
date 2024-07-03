import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println(" Введите имя пользователя");
            String name1 = sc.nextLine();

            System.out.println("Введите возраст пользователя");
            int age1 = sc.nextInt();
            sc.nextLine();

            User user1 = new User(name1, age1);
            users.add(user1);
        }
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        for (User user : users) {
            System.out.println(user.toString());
        }
        sc.close();
    }
}