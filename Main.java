import java.util.Scanner;
class Short {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print short number: ");
        short num = scanner.nextShort();
        if (num >= -10000 && num <= 10000) {
            System.out.println("This is a number in the range [-10000; 10000]");
            }
        else {
            System.out.println("This number is not in the range [-10000; 10000]");
            }

        }
    }
