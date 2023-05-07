
public class Exercicio03 {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10.0, 20.0);
        double area = retangulo.calcularArea();

        System.out.println("Base: " + retangulo.getBase());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + area);
    }

}
class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

}
