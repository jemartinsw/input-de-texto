import java.awt.FlowLayout;//Importa pacote biblioteca módulo componente flowlayout
import java.awt.event.ActionListener;//submódulo da pasta do componente actionlistener
import java.awt.event.ActionEvent;//Importa pacote biblioteca módulo componente actionevent
import javax.swing.JFrame;//Importa pacote biblioteca módulo componente jframe
import javax.swing.JTextField;//Importa pacote biblioteca módulo componente
import javax.swing.JPasswordField;//Importa pacote biblioteca módulo componente
import javax.swing.JOptionPane;//Importa pacote biblioteca módulo componente

public class TextFieldFrame extends JFrame //declaração da classe textfieldframe que está herdando o componente jframe.
{//Inicio do bloco da classe textfieldframe.
   private final JTextField textField1; // Declaração de variável sem atribuiidor, porque não é a atribuição. Private é de uso exclusivo a classe. Onde há final não pode modificar. Há um tipo de field1. 
   private final JTextField textField2; // Declaração de variável sem atribuiidor, porque não é a atribuição. Private é de uso exclusivo a classe. Onde há final não pode modificar. Há um tipo de field2. 
   private final JTextField textField3; // Declaração de variável sem atribuiidor, porque não é a atribuição. Private é de uso exclusivo a classe. Onde há final não pode modificar. Há um tipo de field3. 
   private final JPasswordField passwordField; // Declaração de variável sem atribuiidor, porque não é a atribuição. Private é de uso exclusivo a classe. Onde há final não pode modificar. Há um tipo. 

   public TextFieldFrame()//Exportador do construtor para que ele possa ser importado (pública faz isso).
   {// inicio do bloco do construtor textfieldframe.
      super("Testing JTextField and JPasswordField");//Super define o titulo da janela. Dever ser com aspas duplas.
      setLayout(new FlowLayout());//tipo de saída das camadas que serão renderizados primeiramente.

      textField1 = new JTextField(10); // Há declaração de variável cmo atribuição dentro do construtor o novo JTextField. Dez é a largura das colunas que não etá em pixels.
      add(textField1); // Adiciona o textfield na renderização do quadro.

      textField2 = new JTextField("Enter text here");// Atribui novo textfield sem coluna, apenas de texto. Mas pode ser definido tamanho também.
      add(textField2); // Adiciona o textfield na renderização do quadro.

      textField3 = new JTextField("Uneditable text field", 21);// tribui novo textfield sem coluna, apenas de texto. Mas pode ser definido tamanho também.
      textField3.setEditable(false); // Atribui novo jtextfiel com quantidades específicas de coluna. Não pode ser editado por causa do parâmtetro false
      add(textField3); // Adiciona o textfield na renderização do quadro.

      passwordField = new JPasswordField("Hidden text");// Envia Hidden text
      add(passwordField); // Adiciona o passwordfield na renderização em bolinhas no quadro.

      TextFieldHandler handler = new TextFieldHandler();//Handler é uma variável que significa manipulador, ou seja que manim=pula os campos de texto. A Handler atribui um novo textfieldhandler
      textField1.addActionListener(handler);// Incova método e adiciona escutador de ação do parâmetro handler1 declarado anteriormente.
      textField2.addActionListener(handler);// Incova método e adiciona escutador de ação do parâmetro handler2 declarado anteriormente.
      textField3.addActionListener(handler);// Incova método e adiciona escutador de ação do parâmetro handler3 declarado anteriormente.
      passwordField.addActionListener(handler);// handler é um objeto
   } // finaliza bloco de construtor

   private class TextFieldHandler implements ActionListener// Implements injeta o objeto dentro da classe abaixo.
   {// new actionlistener. Inicio do bloco da classe textfieldhandler
      @Override//sobrescreve o método abaixo que houver embaixo. O @ não exibe notificação warning de alerta.
      public void actionPerformed(ActionEvent event)// Método que está dentro do actionlistener. o action event é o parâmetro. action performed são as ações que vão ocorrer no bloco de códigos para ser executado no bloo de códigos.
      {//Inicia o bloco do método action performed
         String string = ""; //string com s minusculo é o  nome da variavel que pe o tipo da variavel que está com S maiusculo. Atribui um texto vazio para variavel
         if (event.getSource() == textField1)
            string = String.format("textField1: %s",
               event.getActionCommand());// If é o algoritmo de validação que permite validar as ações que estiverem na linha dele. Dois sinais == é operador de comparação do lado esquedo com o direito. Retornado como verdadeiro, a linha abaixo será executada.. S string que estava vazia vai receber um novo texto. Atrinf.format vai entregar o texto formatado. Porcentagem é um caractere coringa. s depois de % retorna uma string (texto). Há dois parâmetros. Um pega o texto que houver dentro do elemento do parãmetro event.

         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
               event.getActionCommand());// pega string do respectivo campo quando clicado em enter.

         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());// pega string do respectivo campo quando clicado em enter.

         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());// pega string do respectivo campo passwordfield quando clicado em enter.

         JOptionPane.showMessageDialog(null, string); // Invoca joptionpane. pede para exibir caixa de diálogo. Precisa de dois parâmetros, um componente pai, que pode ser colocado em algum outro componente. Neste caso está nulo. Segundo parâmetro é string.
      } // Fecha método action permormed
   } // Fecha textfieldhandler 
} // Fecha textfieldframe
