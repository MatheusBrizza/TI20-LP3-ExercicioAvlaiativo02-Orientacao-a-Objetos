# TI20-LP3-ExercicioAvlaiativo02-Orientacao-a-Objetos
Os 4 princípios da orientação a objetos:

Abstração - Manter o trabalho abstrato seria não sobreespecificar algo a ponto de que qualquer mudança necessária acarretará em muito temnpo gasto.

Encapsulamento - Encapsular o projeto poderia ser descrito como "não deixar pontas soltas", o uso do pilar é para proteção do projeto para prevenir o uso incorreto de funções como por exemplo, na classe Tarefa os setters estão marcados como protected, isso impede que o usuário final possa acessá-los.

Herança - Serve para uma classe compartilhar seus atributos e métodos com classes "filhas" assim eliminando o desperdício de memória com código repetido e o tempo gasto reescrevendo tal código repetido em duas classes. O exemplo utilizado no projeto foi a interface cadastroTarefa sendo implementada pela CadastroTarefaImpl que assim puxou da classe superior os métodos contidos nela.

Polimosfismo - É a capacidade de que várias classes derivadas da mesma classe "mãe" possam se comportar de maneiras diferentes. 