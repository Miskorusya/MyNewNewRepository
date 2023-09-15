package hometask14;

import java.util.Random;
import java.util.stream.Stream;

public class UserGenerator {
    public static Stream<User> generateInfiniteStream() {
        Random random = new Random();
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        String[] genders = {"Male", "Female"};

        return Stream.generate(() ->
                new User(names[random.nextInt(names.length)],
                        random.nextInt(60) + 18,
                        random.nextBoolean() ? "email@example.com" : "",
                        genders[random.nextInt(2)]));
    }
}
