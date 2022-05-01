package com.henrizampacheco.java.exercicio02poointerfaces;

/**2. Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes
 * possuem. Para isso, vamos criar um sistema para isso.
 * a) Crie uma interface Tributavel que possui o método calculaTributos(), que
 * retorna um double.
 * b) Alguns bens são tributáveis e outros não, ContaPoupanca não é tributável,
 * já para ContaCorrente você precisa pagar 1% da conta e o SeguroDeVida tem uma
 * taxa fixa de 42 reais.
 * c) As classes ContaCorrente e ContaPoupanca herdam de uma classe Conta. Essa
 * classe Conta possui um saldo e os métodos sacar(double), depositar(double) e
 * obterSaldo() que retorna o saldo da conta.
 * d) Vamos criar uma classe TestaTributavel com um método main para testar o
 * nosso exemplo.
 */
public class SeguroDeVida implements Tributavel {
    private String titular;
    private int numApolice;
    private double valor;

    public SeguroDeVida(String titular, int numApolice, double valor) {
        this.setTitular(titular);
        this.setNumApolice(numApolice);
        this.setValor(valor);
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumApolice() {
        return numApolice;
    }

    public void setNumApolice(int numApolice) {
        this.numApolice = numApolice;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double calculaTributos() {
        return 42.00;
    }
    
    public void tributar() {
        this.setValor(this.valor - this.calculaTributos());
    }

    @Override
    public String toString() {
        return "**SEGURO DE VIDA**" + "\n" +
                "Titular: " + this.getTitular() + "\n" +
                "Nº da Apólice: " + this.getNumApolice() + "\n" +
                "Valor: R$ " + this.getValor() + "\n" +
                "";
    }
}
