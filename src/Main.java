public class Main {

    public static void main(String[] args) {
        findOdd(11);


    }

    static int findOdd(int input) {
        if (input == 1) {
            System.out.println(input);
            return 0;
        }
        if (input % 2 != 0) {
            System.out.println(input);
            findOdd(input - 2);
        }
        if (input % 2 == 0) {
            findOdd(input - 1);
        }
        return 1;
    }
}
