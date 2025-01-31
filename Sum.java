public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while (num <= 100) {
            if (num % 2 == 0) {
                sum += num;
            }
            num++;
        }

        System.out.println("Sum of even numbers between 1 and 100: " + sum);
    }

}
