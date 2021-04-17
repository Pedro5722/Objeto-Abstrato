
public class Main {

	public static void main(String[] args) {
		System.out.println("=================================Objeto abstrato===============================");
		
		aula A1 = new aula();
		A1.Nome = "Programação Orientada a objetos";
		A1.Horas = 40;
		A1.Avaliacao = 4.8f;
		A1.apresentacao();
	
		
		aula A2 = new aula();
		A2.Nome = "Estrutura de dados";
		A2.Horas = 40;
		A2.Avaliacao = 4.9f;
		A2.apresentacao();
		
		

	}

}
