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
public abstract class Conta {
    private String titular;
    private int numConta;
    private double saldo;

    public Conta(String titular, int numConta, double saldo) {
        this.setTitular(titular);
        this.setNumConta(numConta);
        this.setSaldo(saldo);
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double obterSaldo(){
        return this.saldo;
    }    
    
    public void sacar(double valor) {
        if(this.obterSaldo() >= valor){
            this.setSaldo(saldo - valor);
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void depositar(double valor) {
        this.setSaldo(saldo + valor);
        System.out.println("Depósito realizado!");
    }
}
