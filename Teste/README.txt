/*
DESCRIÇÃO
Este programa foi desenvolvido para determinar o número máximo de pessoas que poderiam estar na sala de espera ao mesmo tempo, 
considerando os horários de entrada e saída que foram especificados.

EXPLICAÇÃO TÉCNICA.
A solução é baseada em dois arrays, um para os tempos de entrada (E) e outro para os tempos de saída (S).
Primeiro, ordenamos para poder analisar os eventos na sequência correta.
fazemos as duas varreduras usando 2 ponteiros, um para cada array:
Enquanto isso, se o tempo de entrada é menor que o de saída, temos que ele entrou na sala, então aumentamos o contador.
Senão, temos que alguém saiu e a contagem fica para trás.
Durante o processo, mantemos o controle do maior número que o contador já alcançou, assim obtemos o número máximo de pessoas 
dentro da sala.
O algoritmo tem complexidade O(N log N) para a ordenação dos arrays.

EXPLICAÇÃO SIMPLES.
O programa calcula os horários de entrada e saída de varias pessoas na sala de espera.
Primeiro, alinha esses tempos em ordem crescente. Depois, acompanha o que acontece com o tempo.
Aumenta a contagem de pessoas na sala, cada vez que alguém entra nela. Reduz este seu número cada vez que alguém sai.
Durante o tempo, o sistema também tem de salvar o número máximo de clientes simultâneos.
assim ele nos retorna o número máximo de pessoas.

