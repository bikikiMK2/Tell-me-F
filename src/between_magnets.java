public class between_magnets {
    public static void main(String[] args) {

        System.out.println("磁極1は何[Wb]ですか？");
          double m1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("磁極2は何[Wb]ですか？");
          double m2 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("磁極間の距離は何[m]ですか？");
           double r = new java.util.Scanner(System.in).nextDouble();
           double k = Math.pow(6.33,10^-4);
           double F = (k*(m1)*(m2)/r*r);
        System.out.println("F=" + F + "[N]");

    }
}