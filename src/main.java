import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Complexx step = new Complexx(1, 2);
        Complexx stop = new Complexx(3, 4);

        Complexx res = new Complexx();

        System.out.println("Multiply:");
        res = step.multimpyComplexx(stop);
        System.out.println(res);

        System.out.println("");
        System.out.println("Divide:");
        res = step.divideComplexx(stop);
        System.out.println(res);

        System.out.println("");
        System.out.println("Sum:");
        res = step.sumComplexx(stop);
        //System.out.println(res.getReal() + " " + res.getImage());
        System.out.println(res);


        System.out.println("");
        System.out.println("Trigonometry:");
        res.trigonometryView();

        //System.out.println(Math.ceil(0.99999));

    }
}
