# Leitura do arquivo de jogadores
Crie uma classe Jogador com os atributos privados: id (int), nome (String), altura (int), peso (int), universidade (String), anoNascimento (int), cidadeNascimento (String), e estadoNascimento (String).
Sua classe também terá, pelo menos, dois construtores, e os métodos gets, sets, clone, ler e imprimir. O método imprimir exibe o valor de todos os atributos do objeto (observe o formato de cada linha da saída esperada) e o ler lê os valores dos atributos de um objeto, fornecidos a partir da entrada padrão.
Seu programa deve ler e processar a entrada padrão, que é dividida em duas partes.  A  primeira  delas  apresenta,  em  cada  linha,  os  dados  de  um  dos jogadores da NBA, separados por uma vírgula (‘,’). Esses dados são, nessa ordem:

- id do jogador;
- nome do jogador;
- sua altura;
- seu peso
- universidade que o jogador representa;
- ano de nascimento do jogador;
- nome da cidade em que o jogador nasceu;
- estado em que o jogador nasceu.

A última linha dessa primeira parte da entrada padrão contém apenas a palavra FIM.
Você deve então preencher um vetor de objetos da classe Jogador com os dados dos diversos jogadores informados na primeira parte da entrada padrão. Atenção para os dados de entrada, pois em alguns registros faltam valores e esses devem ser substituídos pela string “nao informado”, na saída padrão.
Depois, seu programa deve processar a segunda parte da entrada padrão. A primeira linha dessa segunda parte informa a quantidade de linhas que devem ser lidas e processadas em seguida, e que representa a quantidade de buscas por jogadores que serão realizadas.
As linhas seguintes contêm, cada uma delas, uma string indicando o id do jogador pesquisado, cujos dados devem ser exibidos na saída padrão.
Na saída padrão, para cada pesquisa, escreva uma linha com os dados do registro correspondente.
A saída padrão deve obedecer o seguinte formato:

[id ## nome ## altura ## peso ## ano de nascimento ## universidade ## cidade de nascimento ## estado de nascimento]