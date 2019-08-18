import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        int position = scanner.nextInt();

        System.out.println(flipBit(value, position));
    }

    public static int flipBit(int value, int bitIndex) {
        int bitNumber = (int)Math.pow(2, bitIndex - 1);

        int zeroOrOne = bitNumber & value;
        if (zeroOrOne != 0){
            return value - bitNumber;
        }
        else{
            return value + bitNumber;
        }
    }
}
