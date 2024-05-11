package livro;

import javax.swing.JOptionPane;

public class Menu {
	
	public void menu() {
		
		SistemaCadastro sist = new SistemaCadastro();
		
		String[] opcoes = {"Cadastrar Livro","Exibir Livro","sair"};
		
		int controle =JOptionPane.showOptionDialog(null,"Sistema de cadastro","Escolha uma das opções:", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		
		do {
			switch(controle) {
			case 0:
				sist.cadastrarLivro();
				menu();
				break;
			case 1:
				sist.exibirLivros();
				menu();
				break;
	  }
	}	while(controle != 0);
  }
}

