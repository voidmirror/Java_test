import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Complexx step = new Complexx(1, 2);
        Complexx stop = new Complexx(3, 4);

        Complexx res = new Complexx();
        res = step.sumComplexx(stop);
        System.out.println(res.getReal() + " " + res.getImage());


    }
}
