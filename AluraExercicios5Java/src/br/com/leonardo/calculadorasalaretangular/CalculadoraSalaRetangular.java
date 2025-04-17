package br.com.leonardo.calculadorasalaretangular;
//2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface
// CalculoGeometrico com os métodos calcularArea() e calcularPerimetro()
// para calcular a área e o perímetro de uma sala retangular. A classe deve
// receber altura e largura como parâmetros.

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public double calcularArea(double altura, double largura) {
        double area = 0;
        area = largura * altura;
        System.out.println("A area é " + area);
        return area;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        double perimetro = 0;
        perimetro =  2 * (largura + altura);
        System.out.println("O perimetro é " + perimetro);
        return perimetro;
    }
}
