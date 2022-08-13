package biblioteca;

import biblioteca.model.Cliente;

public class Menu {
	public static void main(String[] args) {
	Cliente c1 = new Cliente("Gustavo Henrique","Gu","12G34G",100,19,"Masculino");
	
	c1.visualizar();
	c1.login();
	c1.menu();
	
	}
}
