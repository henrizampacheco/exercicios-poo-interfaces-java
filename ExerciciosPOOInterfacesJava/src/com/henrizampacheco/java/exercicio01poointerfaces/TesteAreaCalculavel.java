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
public class TesteAreaCalculavel {
    public static void main(String[] args) {
        AreaCalculavel[] vetGeometricos = new AreaCalculavel[5];
        Quadrado quad1 = new Quadrado(6);
        Quadrado quad2 = new Quadrado(9);
        Retangulo ret1 = new Retangulo(12,6);
        Retangulo ret2 = new Retangulo(15,5);
        Circulo circ1 = new Circulo(10);
        
        vetGeometricos[0] = quad1;
        vetGeometricos[1] = ret1;
        vetGeometricos[2] = circ1;
        vetGeometricos[3] = quad2;
        vetGeometricos[4] = ret2;
        
        for(int i=0; i<vetGeometricos.length; i++) {
            System.out.println(vetGeometricos[i].toString());
        }
    }
}
