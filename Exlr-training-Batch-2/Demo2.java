public class Demo2 {
    public static void main(String[] args) {
        int[] numbers = { 45, 12, 78, 34, 89 };
        if (numbers.length < 2) {
            System.out.println("Array must contain at least two numbers.");
            return;
        }
        int firstGreatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > firstGreatest) {
                secondGreatest = firstGreatest;
                firstGreatest = num;
            } else {
                if (num > secondGreatest && num != firstGreatest) {
                    secondGreatest = num;
                }
            }
        }
        System.out.println("The greatest number is: " + firstGreatest);
        System.out.println("The second greatest number is: " + secondGreatest);
    }
}
