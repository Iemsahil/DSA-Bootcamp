package sahil;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("MD Sahil");
                break;
            case 2:
                System.out.println("Khalid Ibn al-Walid");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Mangement":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
        // Better way to write
        switch (empID) {
            case 1 -> System.out.println("MD Sahil");
            case 2 -> System.out.println("Khalid Ibn al-Walid");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Mangement" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
