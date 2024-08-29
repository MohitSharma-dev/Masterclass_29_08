package Builder;

public class Client {

    public static void enroll(Student st){
        // some work is done over for which id and email are mandatory
        System.out.println("Enrollment is completed");
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        Student s = new Student(1 , "Mohit" , 26, 1998);

        Student s1 = new Student();

        // what if here you client misuses the students and send it to a class which is expecting
        enroll(s);
        // object is already created without any validations
        s1.setAge(24);
        s1.setName("Mohit");
        s1.setId(2);



        // Use Student Builder

//        StudentBuilder studentBuilder = new StudentBuilder();

//        StudentBuilder studentBuilder = Student.getBuilder();
//        studentBuilder.setGradYear(2025);
////        studentBuilder.setName("Mohit");
//        studentBuilder.setId(2);
//        studentBuilder.setAge(24);

        Student st2 =
                        Student
                        .getBuilder()
                        .setId(1)
                        .setName("Mohit")
                        .setAge(24)
                        .setGradYear(2025)
                                .build();



        // Your data will be ready before you create the actual object
//        Student s2 = new Student(studentBuilder);

//        HW : make the constructor private

        enroll(st2);
    }
}
