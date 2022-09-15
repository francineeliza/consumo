import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consumo = new Scanner(System.in);
        int x = consumo.nextInt();
        double y = consumo.nextDouble();
        double c = x / y;
        System.out.println(String.format("%.3f", c) + " km/l");
        consumo.close();
    }
}