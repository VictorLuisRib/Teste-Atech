import java.util.Arrays; // Impota as ferramentas do array
import java.util.Scanner; // Importa a ferramenta de leitura de dados do usuário

public class Atech { // Declaração da classe Atech
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);
        // entrada do número de pessoas que entram e saem do local
        System.out.println("Digite o número de passageiros (N):");
        int n = sc.nextInt();
        
        // inicialização dos arrays 
        int [] entrada = new int[n];
        int [] saida = new int[n];
        
        // preenchimento dos arrays de entrada e saída
        System.out.println("Digite os horários de entrada(E):");
        for (int i = 0; i < n; i++) {
            entrada[i] = sc.nextInt();
        }       
        System.out.println("Digite os horários de saída(S):");
        for (int i = 0; i < n; i++) {
            saida[i] = sc.nextInt();
        }
        
        Arrays.sort(entrada); // ordena o array de entrada
        Arrays.sort(saida);   // ordena o array de saída  
        
        // variáveis para controlar os arrays 
        int entradaIndex = 0;
        int saidaIndex = 0; 
        int pessoasDentro = 0;
        int maxPessoas = 0;
        
        // comparar os horários de entrada e saída
        while (entradaIndex < n && saidaIndex < n) {
            
            if (entrada[entradaIndex] < saida[saidaIndex]) {
                pessoasDentro++;
                maxPessoas = Math.max(maxPessoas, pessoasDentro);
                entradaIndex++; 
            } else {
                pessoasDentro--;
                saidaIndex++;
            }
        }
        
        System.out.println("Número máximo de pessoas na sala: " + maxPessoas); 
        // fechar o scanner para evitar vazamento de recursos
        sc.close();
    }
}

