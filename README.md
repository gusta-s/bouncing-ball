# bouncing-ball
[POO] 2ª avaliação

<h1>THREADING</h1>

<h3>- O que é thread?</h3>

Este termo está ligado ao conceito de processo, mas de maneira leve. Isto é: um programa em execução constituído de códigos executáveis, de dados referentes ao código, pilha de execução, entre outras funções. Os processos se revezam (o SO – sistema operacional - é responsável por esse revezamento) no uso do processador, onde vários processos podem compartilhar o mesmo.
  
<h3>- Java Thread Model</h3>

O sistema de tempo de execução Java depende de threads para muitas coisas. Elas reduzem a ineficiência, evitando o desperdício de ciclos de CPU.
  
Threads existem em vários estados: 
<ul>
  <li><b>Novo -</b> Quando criamos uma instância da classe Thread, um thread está em um novo estado.</li>
  <li><b>Executando -</b> O encadeamento Java está em estado de execução. </li>
  <li><b>Suspenso -</b> Um thread em execução pode ser suspenso, o que suspende temporariamente sua atividade. Um thread suspenso pode então ser retomado, permitindo que continue de onde parou.</li>
  <li><b>Bloqueado -</b> Um encadeamento Java pode ser bloqueado ao aguardar um recurso.</li>
  <li><b>Terminated -</b> Um thread pode ser encerrado, o que interrompe sua execução imediatamente a qualquer momento. Depois que um thread é encerrado, não pode ser retomado.</li>
</ul>

Para entender ainda mais <i>thread</i>, é necessário o conceito de <b>Multitarefa</b>: A capacidade de ter mais de um programa funcionando de forma “simultânea” em uma mesma máquina (a <i>multitarefa</i> real só ocorre em computadores com mais de um processador).

Contudo, para melhor trabalho, existe o método de programação chamado <b>multithread</b>: um programa que contém duas ou mais partes que podem ser executadas simultaneamente. Cada parte desse programa é chamada de <i>thread</i> e cada thread define um caminho separado para a execução. Portanto, <i>multithreading</i> é uma forma especializada de <i>multitarefa</i>.
