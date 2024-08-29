package Builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private int gradYear;

    Student(){

    }

    private Student(StudentBuilder builder){
        this.id = builder.getId();
        if(builder.getName() == null){
            throw new RuntimeException("Name is mandatory");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        if(builder.getGradYear() > 2024){
            throw new RuntimeException("Grad year is not valid");
        }
        this.gradYear = builder.getGradYear();
    }

    Student(int id, String name, int age, int gradYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gradYear = gradYear;
    }

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private int id;
        private String name;
        private int age;
        private int gradYear;

        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        void validate(){
            // all the validations
        }
        // StudentBuilder object will call the build
        // we can pass the same obj
        public Student build(){
            validate();
            return new Student(this);
        }
    }

}
