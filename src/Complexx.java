//package Java_test;
public class Complexx {
    private double real;
    private double image;

    public Complexx() {
        real = 0;
        image = 0;
    }

    public Complexx(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public Complexx sumComplexx(Complexx second) {
        Complexx result = new Complexx();

        result.setReal(real + second.real);
        result.setImage(image + second.image);

        return result;
    }

    public Complexx multimpyComplexx(Complexx second) {
        Complexx result = new Complexx();

        result.setReal(real * second.real - image * second.image);
        result.setImage(real * second.image + second.real * image);

        return result;
    }

    public Complexx divideComplexx(Complexx second) {
        Complexx result = new Complexx();

        result.setReal((real * second.real - image * second.image) / (second.real * second.real + second.image * second.image));
        result.setImage((second.real * image - real * second.image) / (second.real * second.real + second.image * second.image));

        return result;
    }

    public void trigonometryView() {
//        Complexx result = new Complexx();

        double modul = Math.sqrt(Math.pow(real, 2) + Math.pow(image, 2));
        double arg = Math.atan(image / real);

        System.out.println(modul + " * (cos(" + arg + ") + i * sin(" + arg + "))");

    }

    @Override
    public String toString() {
//        System.out.println(real + " + i*" + image);
        return String.format(real + " + i*" + image);
    }
}
