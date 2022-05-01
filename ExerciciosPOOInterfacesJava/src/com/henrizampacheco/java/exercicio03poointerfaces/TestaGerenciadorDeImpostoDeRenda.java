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
public class TestaGerenciadorDeImpostoDeRenda {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenTrib = new GerenciadorDeImpostoDeRenda();
        ContaCorrente cc1 = new ContaCorrente("Sr. Cabeça de Batata", 1, 750.00);
        SeguroDeVida sv1 = new SeguroDeVida("Sr. Cabeça de Batata", 2, 500.00);
        
        System.out.println("Mostrando os tributáveis de uma pessoa: ");
        System.out.println("");
        System.out.println(cc1.toString());
        System.out.println(sv1.toString());
        
        System.out.println("Calculando os tributos...");
        System.out.println("");
        gerenTrib.adicionarTributavel(cc1);
        gerenTrib.adicionarTributavel(sv1);
        
        System.out.println("Tributável da Conta Corrente: R$ " + cc1.calculaTributos());
        System.out.println("Tributável do Seguro de Vida: R$ " + sv1.calculaTributos());
        System.out.println("Total da soma dos tributos: R$ " + gerenTrib.getTotalTributaveis());
        System.out.println("");
    }
}
