package com.henrizampacheco.java.exercicio03poointerfaces;

/**3. Crie um GerenciadorDeImpostoDeRenda, que recebe todos os tributáveis de
 * uma pessoa e soma seus valores e inclua nele um método para devolver seu
 * total. Essa classe deve ter um atributo para calcular a soma total dos
 * tributos e um método adicionar(Tributavel) que recebe como parâmetro um
 * Tributavel e soma os tributos dele ao total. Crie um main para instanciar
 * diversas classes que implementam Tributavel e passar como argumento para um
 * GerenciadorDeImpostoDeRenda. Repare que você não pode passar qualquer tipo de
 * conta para o método adiciona, apenas as que implementam Tributavel.
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
