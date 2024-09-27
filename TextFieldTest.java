import javax.swing.JFrame;// A linha 1 está importando o jframe da biblioteca javax (componentes, modulo (swing) a bliblioteca pacote javax.

public class TextFieldTest// Declaração da classe textfield text, que tem mesmo nome do arquivo.
{// Início do bloco da classe textfieldtext.
   public static void main(String[] args)// Método executor, o método main (principal).
   { // Início do bloco de códigos do método.
      TextFieldFrame textFieldFrame = new TextFieldFrame();//Declraçaõ da variável textfieldframe que está em camelcase que declara a variável. TextFieldFrame é pascalcase que declara o tipo. Declara novo objeto e seu construtor TextFieldFrame.
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Define operação de fechamento padrão. Invoca JFrame. e exit on close.
      textFieldFrame.setSize(350, 100);//Define o tamanho como largura e altura.
      textFieldFrame.setVisible(true);//Define a visibilidade.
   } //Finaliza bloco de códigos do método main
}// Fim do bloco de códigos da classe.
