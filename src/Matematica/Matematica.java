package Matematica;

public class Matematica {

    public static void quickSort(int[] vetor, int inicio, int fim){
        if(fim>inicio){
            int indexPivo = dividir(vetor, inicio, fim);
            quickSort(vetor, inicio, indexPivo-1);
            quickSort(vetor,indexPivo+1, fim);
        }
    }

    private static int dividir(int[] vetor, int inicio, int fim){

        int pivo = vetor[inicio];
        int pontEsq = inicio+1;
        int pontDir = fim;

        while (pontEsq <= pontDir){
            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo){
                pontEsq++;
            }

            while (pontDir >= pontEsq && vetor[pontDir] > pivo){
                pontDir--;
            }

            if(pontEsq < pontDir){
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
