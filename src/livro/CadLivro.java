package livro;

import javax.swing.JOptionPane;

public class CadLivro {

	      String titulo;
	      String autor;
	      int anoPublicacao;

	      public void cadastro() {
		// TODO Auto-generated method stub
		
		titulo = JOptionPane.showInputDialog("Digite o titulo do livro: ");
		autor = JOptionPane.showInputDialog("Digite o nome do autor: ");
		anoPublicacao = Integer.parseInt( JOptionPane.showInputDialog("Digite o ano da publicação: "));
		
	        	 

	}

		public static void exibirLivros() {
			
			JOptionPane.showMessageDialog(null,"Titulo:" + this.titulo + "\nAutor: " + this.autor + "\nPublicação:" + this.anoPublicacao);
			
		}

}
    