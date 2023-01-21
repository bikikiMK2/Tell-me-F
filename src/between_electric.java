public class between_electric {
    public static void main(String [] args){

        System.out.println("電荷1は何[C]ですか？");
        double Q1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("電荷2は何[C]ですか？");
        double Q2 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("電荷間の距離は何[m]ですか？");
        double r = new java.util.Scanner(System.in).nextDouble();
        double k = Math.pow(8.85,10^-12);
        double F = (k*(Q1)*(Q2)/r*r);
        System.out.println("F=" + F + "[N]");

    }
}
