package ex2;

import java.io.*;
import java.util.*;

public class Matriz {
	public int linha;
	public int coluna;
	public int[][] elementos;
	
	public Matriz() {	
	}

	public Matriz(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		this.elementos = new int[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public int[][] getElementos() {
		return elementos;
	}

	public void setElementos(int[][] elementos) {
		this.elementos = elementos;
	}
	

	
	public void lerMatriz() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < linha; i++) {
			for(int j = 0; i < coluna; i++) {
				elementos[i][j] = sc.nextInt();
			}
		}	
	}
	
	public void salvarMatriz(String nomeArquivo) throws IOException{	
		BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo));
		for(int[] linha : elementos) {
			for(int elem : linha) {
				bw.write(elem + " ");
			}
			bw.newLine();
		}
		bw.close();
	}
	
	public void carregarMatriz(String nomeArquivo) throws IOException{	
		BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
		for(int i = 0; i < linha; i++) {
			String[] linha = br.readLine().split(" ");
			for(int j = 0; j < coluna; j++) {
				elementos[i][j] = Integer.parseInt(linha[j]);
			}
		}
		br.close();
	}
	
	public Matriz soma(Matriz outra) {
		if (linha != outra.linha || coluna != outra.coluna) {
			System.out.println("As matrizes devem ter as mesmas dimensões para a soma.");
			//tratamento de erro, estudar mais sobre;
            //throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensões para a soma.");
        }
        Matriz resultado = new Matriz(linha, coluna);
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                resultado.elementos[i][j] = this.elementos[i][j] + outra.elementos[i][j];
            }
        }
        return resultado;
	}
	
	public Matriz subtracao(Matriz outra) {
		if (linha != outra.linha || coluna != outra.coluna) {
			System.out.println("As matrizes devem ter as mesmas dimensões para a subtracao.");
			//tratamento de erro, estudar mais sobre;
            //throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensões para a soma.");
        }
        Matriz resultado = new Matriz(linha, coluna);
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                resultado.elementos[i][j] = this.elementos[i][j] - outra.elementos[i][j];
            }
        }
        return resultado;
	}
	
	public Matriz multiplicacao(Matriz outra) {
	}
	
	public Matriz multiplicacaoEscalar(int escalar) {
	}
	
	public Matriz transposta() {
	}
	

	
	
	sc.close();
}
