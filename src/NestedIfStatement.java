public class NestedIfStatement {
    public static void main(String[] args) {
        String Address = "Guntur, India";

        if (Address.endsWith("India")) {
            if (Address.contains("Guntur")) {
                System.out.println("Your address is Guntur");
            } else if (Address.contains("Banglore")) {
                System.out.println("Your City is Banglore India");
            } else {
                System.out.println(Address.split(",")[0]);
            }
        } else {
            System.out.println("You are not living in India");
        }
    }
}
