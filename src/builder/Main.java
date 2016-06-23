package builder;

public class Main {

    public static void main(String[] args) {

        User.Builder userBuilder = new User.Builder();
        User user1 = userBuilder.setId("GM100").setName("Bob")
                .setScore(5)
                .setActive(true)
                .setTitle("Super Gamer").setDescription("best gamer ever!")
                .build();
        System.out.println(user1.toString());

        User.Builder userBuilder2 = new User.Builder();
        User user2 = userBuilder2.setId("GM123").setActive(false).build();
        System.out.println(user2.toString());

    }
}
