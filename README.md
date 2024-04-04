Regras para a aposta de 0 a 100

    Utilizando a biblioteca Scanner, lê um número inteiro via teclado, de 0 a 100, caso o número seja maior que 100 ou menor que 0, imprime a mensagem: “Aposta inválida.”
    Utiliza a biblioteca Random para sortear aleatoriamente um número de 0 a 100.
    Compara o número escolhido pelo usuário apostador com o número sorteado pelo sistema.
    Caso o usuário acerte a aposta, imprime a mensagem “Você ganhou R$ 1.000,00 reais.”. Caso o usuário erre, imprime a mensagem: “Que pena! O número sorteado foi: X.”

Regras para a aposta de A à Z

    Utilizando o método System.in.read(), lê um char via teclado, de A à Z, podendo ser lido como maiúsculo ou minúsculo. Caso não seja uma letra, imprime a mensagem: “Aposta inválida.”
    Utiliza o método Character.isLetter() para verificar se a entrada digitada é uma letra válida.
    Converte a entrada do usuário apostador para maiúsculo, utilizando o método CharactertoUpperCase().
    A letra premiada é a letra G.
    Compara a letra lida via teclado, e convertida para maiúsculo, com a letra premiada.
    Caso o usuário acerte a aposta, imprime a mensagem “Você ganhou R$ 500,00 reais.”. Caso o usuário erre, imprime a mensagem: “Que pena! A letra sorteada foi: X.”.

Regras para a aposta de número par ou ímpar

    Utilizando a biblioteca Scanner, lê um número inteiro via teclado. Exemplo: 600.
    Utiliza o operador de módulo (%) para verificar se o número é par ou ímpar.
    O prêmio será dado caso o usuário digite um número par. O sistema não premia jogadores que digitarem um número ímpar.
    Se o número digitado for par, imprime a mensagem: “Você ganhou R$ 100,00 reais.”. Caso o usuário digite um número ímpar, imprime a mensagem: “Que pena! O número digitado é ímpar e a premiação foi para números pares.”.

Clonando o projeto

  git clone git@github.com:gabrielecastro/java.git
  cd LotoFacil

Bibliotecas usadas

    Scanner
    Random
    Character

Versão do JDK
21.0.2
