import java.awt.FlowLayout;//Importa pacote biblioteca módulo componente flowlayout
import java.awt.event.ActionListener;//submódulo da pasta do componente actionlistener
import java.awt.event.ActionEvent;//Importa pacote biblioteca módulo componente actionevent
import javax.swing.JFrame;//Importa pacote biblioteca módulo componente jframe
import javax.swing.JTextField;//Importa pacote biblioteca módulo componente
import javax.swing.JPasswordField;//Importa pacote biblioteca módulo componente
import javax.swing.JOptionPane;//Importa pacote biblioteca módulo componente

public class TextField2 extends JFrame //declaração da classe textfieldframe que está herdando o componente jframe.
{//Inicio do bloco da classe textfieldframe.
   private final JTextField textField2; // Declaração de variável sem atribuiidor, porque não é a atribuição. Private é de uso exclusivo a classe. Onde há final não pode modificar. Há um tipo. 

   public TextField2()//Exportador do construtor para que ele possa ser importado (pública faz isso).
   {// inicio do bloco do construtor textfieldframe.
      super("TextField2");//Super define o titulo da janela. Dever ser com aspas duplas.
      setLayout(new FlowLayout());//tipo de saída das camadas que serão renderizados primeiramente.

      textField2 = new JTextField("Hidden text");// Envia Hidden text
      add(textField2); // Adiciona o passwordfield na renderização em bolinhas no quadro.

      TextFieldHandler handler = new TextFieldHandler();//Handler é uma variável que significa manipulador, ou seja que manim=pula os campos de texto. A Handler atribui um novo textfieldhandler
      textField2.addActionListener(handler);// handler é um objeto
   } // finaliza bloco de construtor

   private class TextFieldHandler implements ActionListener// Implements injeta o objeto dentro da classe abaixo.
   {// new actionlistener. Inicio do bloco da classe textfieldhandler
      @Override//sobrescreve o método abaixo que houver embaixo. O @ não exibe notificação warning de alerta.
      public void actionPerformed(ActionEvent event)// Método que está dentro do actionlistener. o action event é o parâmetro. action performed são as ações que vão ocorrer no bloco de códigos para ser executado no bloo de códigos.
      {//Inicia o bloco do método action performed
         String string = ""; //string com s minusculo é o  nome da variavel que pe o tipo da variavel que está com S maiusculo. Atribui um texto vazio para variavel
         if (event.getSource() == textField2)
            string = String.format("textField1: %s",
               event.getActionCommand());// If é o algoritmo de validação que permite validar as ações que estiverem na linha dele. Dois sinais == é operador de comparação do lado esquedo com o direito. Retornado como verdadeiro, a linha abaixo será executada.. S string que estava vazia vai receber um novo texto. Atrinf.format vai entregar o texto formatado. Porcentagem é um caractere coringa. s depois de % retorna uma string (texto). Há dois parâmetros. Um pega o texto que houver dentro do elemento do parãmetro event.

         JOptionPane.showMessageDialog(null, string); // Invoca joptionpane. pede para exibir caixa de diálogo. Precisa de dois parâmetros, um componente pai, que pode ser colocado em algum outro componente. Neste caso está nulo. Segundo parâmetro é string.
      } // Fecha método action permormed
   } // Fecha textfieldhandler 
   public static void main(String[] args)// Método executor, o método main (principal).
   { // Início do bloco de códigos do método.
      TextField2 textField2 = new TextField2();//Declraçaõ da variável PasswordField que está em camelcase que declara a variável. PasswordField é pascalcase que declara o tipo. Declara novo objeto e seu construtor PasswordField.
      textField2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Define operação de fechamento padrão. Invoca JFrame. e exit on close.
      textField2.setSize(350, 100);//Define o tamanho como largura e altura.
      textField2.setVisible(true);//Define a visibilidade.
   } //Finaliza bloco de códigos do método main
} // Fecha textfieldframe