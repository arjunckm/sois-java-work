/*program 2 - sum of the arguments passed */
public class SumofArgsPassed {

    public static void main(String[] args) {
        int sum = 5;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("The sum of the arguments passed is " + sum);
    }
}
