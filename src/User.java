
public class User {

        int id;
        int age;
        String name;
        String surname;
        double weight;
        double height;

    public User (int id, int age, String name, String surname, double weight, double height)
    {
        this.id = id ;
        this.age=age  ;
        this.name = name ;
        this.surname =surname  ;
        this.weight =weight  ;
        this.height = height ;

    }

    public static void main(String[] args) {


        User user1=new User(1,22,"Barak","Obeme", 155,205);
        User user2 = new User(2, 33, "Alice", "Smith", 165, 150);
        User user3 = new User(3, 45, "John", "Doe", 175, 180);
        User user4 = new User(4, 28, "Bob", "Johnson", 160, 190);
        User user5 = new User(5, 31, "Eve", "Obama", 170, 160);
        User user6 = new User(6, 50, "Barak", "Doe", 180, 170);
        User user7 = new User(7, 40, "Alice", "Smith", 165, 150);
        User user8 = new User(8, 22, "John", "Johnson", 175, 180);
        User user9 = new User(9, 27, "Bob", "Obama", 160, 190);
        User user10 = new User(10, 35, "Eve", "Doe", 170, 160);
        System.out.println(user1.age +user2.age+ user3.age+ user4.age+ user5.age+user6.age+user7.age+user8.age+user9.age+user10.age );

        double weightall = user1.weight+user2.weight+user3.weight+user4.weight+user5.weight+user6.weight+user7.weight+user8.weight+user9.weight+user10.weight;
        System.out.println(weightall);
double heightall = user1.height+user2.height+user3.height+user4.height+user5.height+user6.height+user7.height+user8.height+user9.height+user10.height;
        System.out.println(heightall);


    }

}
