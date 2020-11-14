# bouncing-ball
[POO] 2ª avaliação
<h1>SAWING</h1>

<h2>- O que é o Swing</h2>

<p> O swing é uma parte do Java Foundation Classes (JFC) usada para criar aplicações baseada em janelas. É baseada no AWT, porém possui algumas diferenças melhoradas. São algumas delas:</p>
<ol>
	<li> Possui componentes independentes</li>
	<li> Possui componentes mais leves </li>
	<li> Possui uma maior variedade de componentes</li>	
</ol>
<h2>- Manipulação e Utilização</h2>

<p> Para o uso do Java Swing, é necessário a importação</p>
<blockquote> import javax.swing.*; </blockquote>

<p>Para uma aplicação simples, deve-se criar um frame, onde é adicionado todos os componentes e configurado no padrão desejado
<blockquote> JFrame f = new JFrame( ); </blockquote>

<p>Segue uma lista de métodos para a utilização e configuração simples de uma janela com um botão:</p>
<blockquote>JButton b = new JBtuton(“nome do butão”);</blockquote>

<p>Gera um botão com o nome desejado, porém ainda nao é possível a visualização dentro da janela</p>
<blockquote>b.setBounds(130,100,100, 40);</blockquote>

<p> Configura o botão b no eixo x e y e do tamanho do comprimento e altura.
Agora podemos adiciona-lo dentro da janela com o comando: </p>
<blockquote>f.add(b);</blockquote>

<p> Para configurar o tamanho da janela a ser criada com essa aplicação, é possível utilizando setSize</p>
<blockquote> f.setSize(500,500)</blockquote>

<p> Para a janela se tornar visível, aplicamos um setVisible:</p>
<blockquote>f.setVisible(true);</blockquote>

<p> Utilizando o principio desse algoritmo acima, é possivel entender o funcionamente do Java Swing. O Java Swing possui muitos outros tipos de componentes para a crianção de uma aplicação com janela, no entando, foi citado apenas os principais. Caso haja o desejo de conhecer as outras ferramentas, basta acessar: <a href = "https://www.devmedia.com.br/java-swing-conheca-os-componentes-jtextfield-e-jformattedtextfield/30981">Java Swing: Conheça os componentes JTextField e JFormattedTextField"</a></p>

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

### - Multithreading em java
Além disso, as Multithreading, conceituadas anteriormente, são construídas sobre a classe Thread, seus métodos e sua interface complementar, *Runnable*. Para criar um novo thread, seu programa irá estender Thread ou implementar a interface *Runnable*, o que permite que você escreva de uma maneira em que várias atividades possam prosseguir simultaneamente no mesmo programa.

### - Tópico Principal Java
Esse tópico mostra como usar a interface Thread e Runnable para criar e gerenciar threads, começando com o thread principal de java. Além disso, é de suma importância, pois afetar os outros tópicos "filhos", executa várias ações de desligamento e ele é criado automaticamente quando seu programa é iniciado. 

### - Como criar uma Thread Java
Java permite que você crie um thread de duas maneiras:
1. **Interface executável:**
  * **Passo 1:**
  Como primeira etapa, você precisa implementar um método run () fornecido por uma interface Runnable . Este método fornece um ponto de entrada para o encadeamento e você colocará sua lógica de negócios completa dentro desse método.
  ```
  public void run()
  ```
  * **Passo 2:**
  Dentro de run (), definiremos o código que constitui a nova thread. Exemplo:
   ```
  public class MyClass implements Runnable{
    public void run(){
      System.out.println("MyClass rodando");
    }
  }
  ```
   * **Passo 3:**
   Para executar o método run () por um thread, passe uma instância de MyClass para um Thread em seu construtor. Exemplo:
   ```
    Topico1 t1: new Topico( new MyClass());
    t1.start()
    // console: MyClass rodando
   ```
2. **Estendendo Java Thread:**
  * A segunda maneira de criar um thread é criar uma nova classe que estenda Thread. De maneira similar ao interface executável, sobrescreve-se o método run( ) e então cria uma instância dessa classe. O método run( ) é o que é executado pela thread depois que você chama start (), em seguida, só precisa criar e iniciar o tópico anterior. Exemplo:
  ```
  public class MyClass extends Runnable{
    public void run(){
      System.out.println("MyClass rodando");
    }
  }
    //instanciando o método
    Thread t1 = new MyClass();
    t1.start();
  ```
Até agora, usamos apenas dois threads: o thread principal e um thread filho . No entanto, nosso programa pode afetar quantos threads forem necessários. Vamos ver como podemos criar vários threads.


