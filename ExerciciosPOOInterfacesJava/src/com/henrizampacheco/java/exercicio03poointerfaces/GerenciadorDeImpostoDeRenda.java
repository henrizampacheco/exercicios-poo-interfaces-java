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
public class GerenciadorDeImpostoDeRenda {
    private double totalTributaveis = 0;
    
    void adicionarTributavel(Tributavel tributavel) {
        this.setTotalTributaveis(this.getTotalTributaveis() + tributavel.calculaTributos());
    }

    public double getTotalTributaveis() {
        return totalTributaveis;
    }

    public void setTotalTributaveis(double totalTributaveis) {
        this.totalTributaveis = totalTributaveis;
    }
}
