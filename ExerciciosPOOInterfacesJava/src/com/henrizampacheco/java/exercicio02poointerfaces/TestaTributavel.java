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
public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Buzz Lightyear", 1, 0);
        ContaPoupanca cp1 = new ContaPoupanca("Woody", 2, 0);
        SeguroDeVida sv1 = new SeguroDeVida("Jessie", 3, 0);
        
        System.out.println("Informações dos clientes do banco (zeradas): ");
        System.out.println("");
        System.out.println(cc1.toString());
        System.out.println(cp1.toString());
        System.out.println(sv1.toString());
        
        System.out.println("Testando os depósitos: ");
        System.out.println("");
        System.out.println("1 - Conta Corrente do cliente " + cc1.getTitular());
        cc1.depositar(1000.00);
        System.out.println("2 - Conta Poupança do cliente " + cp1.getTitular());
        cp1.depositar(1000.00);
        System.out.println("3 - Seguro de Vida da cliente " + sv1.getTitular());
        sv1.setValor(1000.00);
        System.out.println("");
        
        System.out.println("Informações após os depósitos: ");
        System.out.println("");
        System.out.println(cc1.toString());
        System.out.println(cp1.toString());
        System.out.println(sv1.toString());
        
        System.out.println("Testando a tributação: ");
        System.out.println("");
        System.out.println("Valor a ser tributado da Conta Corrente: R$ " + cc1.calculaTributos());
        cc1.sacar(cc1.calculaTributos());
        System.out.println("*Conta Poupança: Não tributável");
        System.out.println("Valor a ser tributado do Seguro de Vida: R$ " + sv1.calculaTributos());
        sv1.tributar();
        
        System.out.println("Informações após a tributação: ");
        System.out.println("");
        System.out.println(cc1.toString());
        System.out.println(cp1.toString());
        System.out.println(sv1.toString());
    }
}
