package br.edu.ifsp.fe1.licao02;

/**
 * 6. Faça um teste criando dois objetos da classe Agencia. Altere e imprima os
 atributos desses objetos.
 *
 * @author falvojr
 */
class MainExercicio06 {

    public static void main(String[] args) {
        Agencia agencia1 = new Agencia(1);
        Agencia agencia2 = new Agencia(2);

        System.out.println(agencia1.numero);
        System.out.println(agencia2.numero);
    }

}
