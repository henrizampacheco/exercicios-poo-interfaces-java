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
