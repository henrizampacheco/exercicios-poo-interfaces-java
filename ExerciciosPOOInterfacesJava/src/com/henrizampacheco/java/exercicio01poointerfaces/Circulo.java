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
public class Circulo implements AreaCalculavel {
    double raio;

    public Circulo(double raio) {
        this.setRaio(raio);
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        double area;
        
        area = Math.PI * raio * raio;
        
        return area;
    }

    @Override
    public String toString() {
        return "***CÍRCULO***" + "\n" +
                "Tam. Raio: " + this.getRaio() + "\n" +
                "Tam. Área: " + this.calculaArea() + "\n" +
                "";
    }
}
