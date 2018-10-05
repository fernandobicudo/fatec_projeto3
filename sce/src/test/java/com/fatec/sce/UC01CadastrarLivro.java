package com.fatec.sce;

public class UC01CadastrarLivro {
	@Test
	public void CT01CadastrarLivroComDadosValidos(){
		try{
			//cenario
			Livro umLivro = new Livro();
			//acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		}catch(RuntimeException e){
			//verificacao
			fail ("nao deve falhar");
		}
	}
} 