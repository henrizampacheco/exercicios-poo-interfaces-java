package com.henrizampacheco.java.exercicio01poointerfaces;

/**1. Faça o que pede a questão.
 * a) Crie um projeto interfaces e crie a interface AreaCalculavel com o método
 * calculaArea() - sem parâmetros e que retorna um double.
 * b) Queremos criar algumas classes que implementam AreaCalculavel:
 * I. Quadrado: possui um atributo lado.
 * II. Retangulo: possui os atributos base e altura.
 * III. Circulo: possui o atributo raio.
 * c) Crie uma classe de Teste. No método main crie um vetor de 5 posições que
 * contém alguns objetos do tipo AreaCalculavel. Logo após, percorra esse vetor
 * imprimindo a área de cada objeto.
 */
public class Quadrado implements AreaCalculavel {
    double lado;

    public Quadrado(double lado) {
        this.setLado(lado);
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        double area;
        
        area = this.getLado() * this.getLado();
        
        return area;
    }

    @Override
    public String toString() {
        return "***QUADRADO***" + "\n" +
                "Tam. Lado: " + this.getLado() + "\n" +
                "Tam. Área: " + this.calculaArea() + "\n" +
                "";
    }
}