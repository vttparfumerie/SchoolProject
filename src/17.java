public class SchoolProject {
    public static void main(String[] args) {
        // Example of simple student data
        Student student = new Student(101, "John Doe", 25, 95);
        
        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", Gender: " + student.getGender());
    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    public Student(int id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
