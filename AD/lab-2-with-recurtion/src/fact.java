public class fact {
    public static long FACTORIAL(int num)
    {
        if (num >= 1)
            return num * FACTORIAL(num - 1);
        else
            return 1;
    }

        public static void main(String[] args) {
            int num = 6;
            long factorial = FACTORIAL(num);
            System.out.println("Factorial of " + num + " = " + factorial);
        }

}
