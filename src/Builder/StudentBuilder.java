//package Builder;
//
//public class StudentBuilder {
//    private int id;
//    private String name;
//    private int age;
//    private int gradYear;
//
//    public int getId() {
//        return id;
//    }
//
//    public StudentBuilder setId(int id) {
//        this.id = id;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public StudentBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public StudentBuilder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public StudentBuilder setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//    // StudentBuilder object will call the build
//    // we can pass the same obj
//    public Student build(){
//       return new Student(this);
//    }
//}
