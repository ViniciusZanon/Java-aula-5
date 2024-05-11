package livro;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SistemaCadastro {
	ArrayList<CadLivro> livros = new ArrayList<>();

	public void menu() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	public void cadastrarLivro() { 
	
		CadLivro livro = new CadLivro();
		livro.cadastro();
		livros.add(livro);
		JOptionPane.showMessageDialog(null, livro.titulo + "Cadastrado com sucesso!");
		
	}
	
	public void exibirLivros() {
		if(livros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não existem livros cadastrados!");
   }else {
	   for(CadLivro livro : livros) {
		   livro.exibirLivros();
	   }
     }
   }
 }
