public class SwapNumbers {

    public static void main(String[] args) {

        int A = 10;
        int B = 20;
        int C = 0;

        // swapping using third variable
        C = A;
        A = B;
        B = C;

        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
