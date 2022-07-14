package Projeto;

import java.util.Scanner;

public class Decisao {

    public static void main(String[] args) {

/*         Esse trecho simula a escolha que o usuário 
           tem após efetuar o login apenas pela primeira vez, pois
           considera-se que o site/app lembrará dessa configuração 
           até que ela seja alterada.

           A simulação consiste no usuário escolher se quer ser doador
           de insumos ou ser beneficiado pela doação destes.
*/

        int botao;

        Scanner leia = new Scanner(System.in);
        System.out.println("Como o do(acao) pode ser útil para você, usuário? ");
        System.out.println("Use 1 para - Eu gostaria de doar | e 2 para - Eu preciso de ajuda! ");

        botao = leia.nextInt();

        if (botao == 1) {
        System.out.println("Eu gostaria de doar!");
        }

        if (botao == 2) {
        System.out.println("Eu preciso de ajuda! ");
        }

        leia.close();

    }

}