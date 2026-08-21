class ProfileDetails {
    String name;

    ProfileDetails(String name) {
        this.name = name;
    }

    ProfileDetails(ProfileDetails other) {
        this.name = other.name;
    }
}

public class CopyConstructorExample {
    public static void main(String[] args) {
        ProfileDetails original = new ProfileDetails("Ganesh");
        ProfileDetails copy = new ProfileDetails(original);
        System.out.println("Original: " + original.name);
        System.out.println("Copy: " + copy.name);
    }
}