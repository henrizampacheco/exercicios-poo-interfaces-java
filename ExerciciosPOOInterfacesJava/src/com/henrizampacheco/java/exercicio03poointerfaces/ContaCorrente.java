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
