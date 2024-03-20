package third;

public class Person {
    private final String name;
    private final int age;
    private final Education education;
    public Person(String name, int age, Education education){
        this.name = name;
        this.age = age;
        this.education = education;
    }

    public double eduPoints() {
        if (education == Education.SCHOOL_EDUCATION) {
            return 1;
        }
        else if (education == Education.COLLEGE) {
            return 1.5;
        }
        else if (education == Education.INCOMPLETE_HIGHER) {
            return 1.8;
        }
        else if (education == Education.HIGHER) {
            return 2;
        }
        return 0;
    }
}
