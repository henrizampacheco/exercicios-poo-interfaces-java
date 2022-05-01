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
public class ContaCorrente extends Conta implements Tributavel {
    
    public ContaCorrente(String titular, int numConta, double saldo) {
        super(titular, numConta, saldo);
    }

    @Override
    public double calculaTributos() {
        return this.obterSaldo() * 0.01;
    }

    @Override
    public String toString() {
        return "**CONTA CORRENTE**" + "\n" +
                "Titular: " + this.getTitular() + "\n" +
                "Nº da Conta: " + this.getNumConta() + "\n" +
                "Saldo: R$ " + this.obterSaldo() + "\n" +
                "";
    }
}
