import java.util.Arrays; 
import java.util.Scanner; 

public class Atech { 
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de passageiros (N):");
        int n = sc.nextInt();
        
         
        int [] entrada = new int[n];
        int [] saida = new int[n];
        
        
        System.out.println("Digite os horários de entrada(E):");
        for (int i = 0; i < n; i++) {
            entrada[i] = sc.nextInt();
        }       
        System.out.println("Digite os horários de saída(S):");
        for (int i = 0; i < n; i++) {
            saida[i] = sc.nextInt();
        }
        
        Arrays.sort(entrada); 
        Arrays.sort(saida);   
        
         
        int entradaIndex = 0;
        int saidaIndex = 0; 
        int pessoasDentro = 0;
        int maxPessoas = 0;
        
        
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
       
        sc.close();
    }
}

