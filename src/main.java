import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner fx = new Scanner(System.in);
        int num;
        num = fx.nextInt();
        System.out.println("yep " + num);

        Person Andrey = new Person();

        Andrey.setHeight(169);
        System.out.println("Andrey's height = " + Andrey.getHeight());
    }
}
