# Leitura do arquivo de jogadores

Utilize a classe Jogador especificada e desenvolvida na prática anterior.
Seu  programa  deve  ler  um  arquivo-texto  chamado  jogadores.txt. Você deve preencher um vetor de objetos da classe Jogador com os dados dos diversos jogadores da NBA informados nesse arquivo. Atenção para os dados de entrada, pois em alguns registros faltam valores e esses devem ser substituídos pela string “nao informado”, na saída padrão.
Cada uma das linhas presentes no arquivo indica os dados de um jogador, separados pelo símbolo ‘,’. Esses dados são, nessa ordem:
-    id do jogador;
-    nome do jogador;
-    sua altura;
-    seu peso;
-    universidade que o jogador representa;
-    ano de nascimento do jogador;
-    nome da cidade em que o jogador nasceu;
-    estado em que o jogador nasceu.

Depois, seu programa deve processar a entrada padrão. A primeira linha lida da entrada  padrão informa  a  quantidade  de  linhas  que  devem  ser  lidas  e processadas  em  seguida,  e  que  representa  a  quantidade  de  buscas  por jogadores que serão realizadas.
     As linhas seguintes contêm, cada uma delas, uma string indicando o id do jogador pesquisado, cujos dados devem ser exibidos na saída padrão.
     Na saída padrão, para cada pesquisa, escreva uma linha com os dados do registro correspondente.
     A saída padrão deve obedecer o seguinte formato:
     
[id ## nome ## altura ## peso ## ano de nascimento ## universidade ## cidade de nascimento ## estado de nascimento]