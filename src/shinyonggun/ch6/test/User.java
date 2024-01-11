package shinyonggun.ch6.test;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
//        name.length()
        if (name.length() > 5 || name.isBlank()) {
            throw new IllegalArgumentException("이름 제대로 지어 병신아 - " + name);
        }
        validate(age);
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        validate(age);
        this.age = age;
    }

    private static void validate(int age) {
        if (age > 100 || age < 0) {
            throw new IllegalArgumentException("나이는 0 ~ 100 사이어야합니다. - " + age);
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
