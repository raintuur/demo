public class Student {

    private String name;
    private int age;
    private char classGroup;
    private boolean graduated;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(char classGroup) {
        this.classGroup = classGroup;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classGroup=" + classGroup +
                ", graduated=" + graduated +
                '}';
    }
}
