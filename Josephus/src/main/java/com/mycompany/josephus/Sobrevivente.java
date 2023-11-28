/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.josephus;

/**
 *
 * @author Pc-lab
 */
public class Sobrevivente {
    
    public int encontrarSobrevivente(int x) {
        Pessoas pessoas = new Pessoas();
        int n = pessoas.listaDePessoas.size();
        int indice = 0;

        while (n > 1) {
            // Calculamos o índice para evitar que ele seja maior que o tamanho da lista
            indice = (indice + x - 1) % n;
            
            // Removemos a pessoa da lista
            pessoas.listaDePessoas.remove(indice);
            n--;
        }

        return pessoas.listaDePessoas.get(0).getNumero();
    }
}
