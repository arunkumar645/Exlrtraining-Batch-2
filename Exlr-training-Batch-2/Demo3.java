public class Demo3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("Num1 is greater" + num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("Num2 is Greater" + num2);
        } else {
            System.out.println("Num3 is greater" + num3);
        }

    }
}
