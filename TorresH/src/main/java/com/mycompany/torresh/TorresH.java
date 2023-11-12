/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license*/
package com.mycompany.torresh;

public class TorresH{

    // Método que implementa a recursão
    static long torresDeHanoi(int n) {
        if (n == 1) {
            return 1; // Mova um disco
        }

        long movimento = torresDeHanoi(n - 1) * 2;
        return movimento + 1 ; // Mova o disco n e some os movimentos
    }

    // executando o Hanoi
    public static void main(String[] args) {
        int n = 41; // número de discos

        // Executa as Torres de Hanoi e registra o tempo gasto
        long inicio = System.currentTimeMillis();
        long movimentos = torresDeHanoi(n);
        long fim = System.currentTimeMillis();

        long tempoGasto = fim - inicio;
        String tempoConvertido = formatElapsedTime(tempoGasto);
        System.out.println("Tempo gasto: " + tempoConvertido);
        System.out.println("Movimentos realizados: " + movimentos);
    }

    // convertendo o tempo
    public static String formatElapsedTime(long tempoGasto) {
        long segundos = tempoGasto / 1000;
        long minutos = segundos / 60;
        long horas = minutos / 60;

        return String.format("%02d:%02d:%02d:%02d", horas, minutos % 60, segundos % 60, tempoGasto % 1000);
    }
}