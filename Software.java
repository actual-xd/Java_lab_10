public class Software {
    @Version(number = "1.0", author = "Alice")
    public void featureOne() {
        System.out.println("Executing method.");
    }

    @Version(number = "1.1", author = "Bob")
    public void featureTwo() {
        System.out.println("Executing method.");
    }
}
