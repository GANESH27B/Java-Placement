class CourseDetails {
    String name;
    int duration;

    CourseDetails(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
}

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        CourseDetails course = new CourseDetails("Java", 90);
        System.out.println(course.name + ": " + course.duration + " days");
    }
}