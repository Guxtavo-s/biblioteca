package biblioteca.model;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private String login;
	private String senha;
	private int saldo;
	private int idade;
	private String genero;
	
	Scanner input = new Scanner(System.in);

	public Cliente(String nome, String login, String senha, int saldo, int idade, String genero) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.saldo = saldo;
		this.idade = idade;
		this.genero = genero;
	}
	
	public void login() {
		String a,b;
		System.out.println("login: ");
		a = input.nextLine();
		System.out.println("senha: ");
		b = input.nextLine();
		
		if(a.equals(this.login) && b.equals(this.senha)) {
		System.out.println("Coloque exibir menu aqui");
		}else {
			System.out.println("Login ou senha incorretos!");
		}
	}
	
	public void menu() {
		int op =0;
		
		System.out.println("GENEROS: ");
		System.out.println("(1)Romance");
		System.out.println("(2)Ficcao");
		System.out.println("(3)Terror");
		System.out.println("(4)Comedia");
		System.out.println("(5)Auto-Ajuda");
		System.out.println("(6)Aventura");
		System.out.println("(7)Infantil");
		System.out.println("Escolha uma opcao: ");
		op = input.nextInt();
		int a = 0;
		switch(op) {
		
		case 1: System.out.println("Escolha uma opcao: ");
				System.out.println("ROMANCE: ");
				System.out.println("(1)Romeo e Julieta: ");
				System.out.println("(2)O apanhador no campo de Centeio: ");
				System.out.println("(3)A peste: ");
				System.out.println("(4)O Amor nos tempos do colera: ");
				System.out.println("(5)Cidade de papel: ");
				System.out.println("(6)Dom Casmurro: ");
				a=input.nextInt();
		
		if(a == 1) {
			System.out.println("\nO amor apresenta-se à vida de Romeu e Julieta de modo traiçoeiro - "
					+ "\nambos apaixonam-se instantaneamente, em uma festa - "
					+ "\num baile de máscaras -, desconhecendo a identidade um do outro."
					+ "\nEle é filho dos Montéquio, e ela, dos Capuleto, duas das mais poderosas "
					+ "\nfamílias de Verona, inimigas entre si.");
			loja();
			}
		else if(a ==2) {
			System.out.println("É Natal, e Holden Caulfield conseguiu ser expulso de mais uma escola. Com uns trocados da venda de uma máquina de escrever e "
					+ "\nportando seu indefectível boné vermelho de caçador, "
					+ "\no jovem traça um plano incerto: tomar um trem para Nova York e vagar por três dias pela grande cidade,"
					+ "\nadiando a volta à casa dos pais até que eles recebam a notícia da expulsão por alguém da escola."
					+ "\nSeus dias e noites serão marcados por encontros confusos, e ocasionalmente comoventes, "
					+ "\ncom estranhos, brigas com os tipos mais desprezíveis, encontros com ex-namoradas, visitas à sua irmã Phoebe -- "
					+ "\na única criatura neste mundo que parece entendê-lo -- "
					+ "\ne por dúvidas que irão consumi-lo durante sua estadia,"
					+ "\nentre elas uma questão recorrente: afinal, para onde vão os patos do Central Park no inverno?");
			loja();
		}
		else if(a == 3) {
			System.out.println("Na manhã de um dia 16 de abril dos anos de 1940, o doutor Bernard Rieux sai do seu "
					+ "\nconsultório e tropeça num rato morto. "
					+ "\nEste é o primeiro sinal de uma epidemia de peste que em"
					+ "\nbreve toma conta de toda a cidade de Orão, na Argélia."
					+ "\nSujeita a quarentena, esta torna-se um território irrespirável e os seus habitantes são"
					+ "\nconduzidos até estados de sofrimento, de loucura, mas também de compaixão de proporções desmedidas.");
			loja();
		}
		else if(a == 4) {
			System.out.println("Florentino Ariza nunca esqueceu Fermina, seu primeiro amor. "
					+ "\nEle esperou quase a vida toda por ela, que se casou com outro. "
					+ "\nAgora, 51 anos depois, o marido morre, e ele finalmente tem uma chance de reconquistá-la.");
			loja();
		}
		else if(a==5) {
			System.out.println("É Natal, e Holden Caulfield conseguiu ser expulso de mais uma escola. Com uns trocados da venda de uma máquina de escrever e"
					+ " \nnportando seu indefectível boné vermelho de caçador,"
					+ " \nno jovem traça um plano incerto: tomar um trem para Nova York e vagar por três dias pela grande cidade, "
					+ "\nadiando a volta à casa dos pais até que eles recebam a notícia da expulsão por alguém da escola.");
					loja();
		}
		else if(a == 6) {
			System.out.println("\nDom Casmurro conta a história de Bento Santiago (Bentinho), "
					+ "\napelidado de Dom Casmurro por ser calado e introvertido."
					+ "\nNa adolescência, apaixona-se por Capítu, abandonando o seminário e,"
					+ "\ncom ele, os desígnios traçados por sua mãe, Dona Glória, para que se tornasse padre.");
			loja();
		}
		break;
		 
		case 3: System.out.println("Escolha uma opcao: ");
		System.out.println("TERROR: ");
		System.out.println("(1)Medo - Edgar Allan Poe: ");
		System.out.println("(2)Carrie - Stephen King: ");
		System.out.println("(3)Frankenstrein - Mary Shelley: ");
		System.out.println("(4)It - a coisa - Stephen King: ");
		System.out.println("(5)O mistério da casa do lago - Diego Cassiolato: ");
		System.out.println("(6)Condado maldito: Bruxas e Assombrações - Cullen Bunn: ");
		a=input.nextInt();
		
		if(a==1) {
			System.out.println("As asas de um corvo se misturam à escuridão. "
					+ "A velha casa em ruínas observa com janelas que pareciam olhos."
					+ " Você jura ouvir a voz de alguém que já partiu para o outro lado,"
					+ " bem na hora em que um gato preto cruza seu caminho. "
					+ "Tudo o que hoje conhecemos como terror começou a ganhar "
					+ "forma na obra de Edgar Allan Poe.");
			loja();
		}
		else if(a==2) {
			System.out.println("Carrie é uma adolescente tímida e solitária. Aos 16 anos, é completamente dominada pela mãe, "
					+ "uma fanática religiosa que reprime todas as vontades "
					+ "e descobertas normais aos jovens de sua idade. Para Carrie, "
					+ "tudo é pecado. Viver é enfrentar todo dia o terrível peso da culpa.");
			loja();
		}
		else if(a==3) {
			System.out.println("O brilhante e pouco ortodoxo doutor Victor Frankestein trabalha na criação de um monstro com partes de "
					+ "diferentes corpos humanos. Após ser rejeitada pelo criador,"
					+ "a criatura escapa e passa a agir com uma violenta sede de vingança.");
			loja();
		}
		else if(a==4) {
			System.out.println("Naquele verão, eles enfrentaram pela primeira vez a Coisa, um ser sobrenatural e "
					+ "maligno que deixou terríveis marcas de sangue em Derry. "
					+ "Quase trinta anos depois, os amigos voltam a se encontrar. "
					+ "Uma nova onda de terror tomou a pequena cidade, "
					+ "e somente eles serão capazes de enfrentar a Coisa. O tempo é curto.");
			loja();
		}
		else if(a==5) {
			System.out.println("Jack Campbell, um professor de natação, e sua pequena filha Emily, "
					+ "decidem passar um tempo juntos em uma casa do lago "
					+ "a fim de superarem o luto pela morte de Hannah,"
					+ " ex-esposa de Jack e mãe de Emily. Mas, logo após chegarem à propriedade, "
					+ "Emily afirma ter visto uma menina misteriosa na floresta e, "
					+ "no porão da casa, Jack encontra desenhos antigos que parecem ter sido feitos por uma criança. "
					+ "Os desenhos parecem retratar uma pequena família feliz que sofreu uma grande tragédia.\r\n"
					+ "\r\n"
					+ "O que aconteceu com essa família? A menina da floresta é real? Estariam Jack e "
					+ "Emily ligando-se aos desaparecimentos que ocorreram naquela propriedade muitos anos atrás? "
					+ "Enquanto tenta descobrir respostas, Jack precisa salvar sua filha de um mundo gélido e sombrio, "
					+ "e de perigos inimagináveis que tem que enfrentar.");
			loja();
		}
		else if(a==6) {
			System.out.println("Emmy sempre soube que a floresta ao redor de sua casa estava cheia de fantasmas e monstros. "
					+ "No entanto, na véspera de seu aniversário de dezoito anos ela descobre que está conectada "
					+ "a essas criaturas ― e à própria terra ― de uma maneira que não imaginava ser possível. "
					+ "Aguarde na sombra do carvalho retorcido e ouça o balido das cabras. Condado Maldito: Bruxas & "
					+ "Assombrações é o primeiro de uma série de oito volumes a ser publicada pela "
					+ "DarkSide Books em parceria com a Macabra Filmes ao longo dos próximos meses, e chega para "
					+ "os leitores em uma edição assombrosa e com um tratamento especial de tirar o fôlego. "
					+ "Você está pronto para ver os cordeiros virarem lobos?");
			loja();
		}
		break;
		}
		
	}
	public void deposito(double depTotal) {
		System.out.println("Bem vindo a sessao de compras!");
		System.out.println("Faca um deposito: ");
		depTotal = input.nextDouble();
		this.saldo += depTotal;
	}
	
	public void loja() {
		int op =0;
		
		System.out.println("Escolha a opcao desejada: ");
		System.out.println("(1)COMPRAR");
		System.out.println("(2)ALUGAR");
		System.out.println("(3)RETORNAR AO MENU");
		op = input.nextInt();
		if(op == 1) {
			int preco = 25;//TESTE DELETAR DEPOIS
			System.out.println("O livro custa R$"+preco);
			if(this.saldo - preco <0) {
				System.out.println("Saldo insuficiente!!");
			}else {
				this.saldo -= preco;
				System.out.println("Compra realizada com sucesso!!");
				System.out.println("Novo saldo: R$"+this.saldo);
				menu();
			}
		}
		else if(op == 2) {
			int aluguel = 3;
			this.saldo -= aluguel;
			System.out.println("O aluguel do livro custa: "+aluguel+"R$ por dia.");
			System.out.println("Seu novo saldo ficou em: "+this.saldo);
		}
		else {
			menu();
		}	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void visualizar() {
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("Dados do cliente: ");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("Nome do cliente: "+this.nome);
		System.out.println("Login do cliente: "+this.login);
		System.out.println("Senha do cliente: "+this.senha);
		System.out.println("Saldo disponivel do cliente: "+this.saldo);
		System.out.println("Idade do cliente: "+this.idade);
		System.out.println("Gênero do cliente: "+this.genero);
	}
	
	
	

}
