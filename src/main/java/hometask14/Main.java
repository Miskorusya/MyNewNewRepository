package hometask14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Main {
    public static void main(String[] args) {
        Stream<User> userStream = UserGenerator.generateInfiniteStream().limit(20);

        Map<String, List<String>> groupedUsers = userStream
                .filter(user -> user.getAge() > 18)
                .filter(user -> !user.getEmail().isEmpty())
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.groupingBy(User::getGender,
                        Collectors.mapping(User::getName, Collectors.toList())));

        System.out.println(groupedUsers);
    }

    private static class User {
        private String name;
        private int age;
        private String email;
        private String gender;

        public User(String name, int age, String email, String gender) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getGender() {
            return gender;
        }
    }

    private static class UserGenerator {
        public static Stream<User> generateInfiniteStream() {
            Random random = new Random();
            String[] maleNames = {"John", "Bill", "Bob", "David", "Tom"};
            String[] femaleNames = {"Alice", "Clara", "Kate", "Eve", "Linda"};
            String[] genders = {"Male", "Female"};

            return Stream.generate(() -> {
                String gender = genders[random.nextInt(2)];
                String name;
                if ("Male".equals(gender)) {
                    name = maleNames[random.nextInt(maleNames.length)];
                } else {
                    name = femaleNames[random.nextInt(femaleNames.length)];
                }
                return new User(name, random.nextInt(60) + 18, generateRandomEmail(), gender);
            });
        }

        private static String generateRandomEmail() {
            return "email@example.com";
        }
    }
}



