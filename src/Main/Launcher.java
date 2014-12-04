package Main;

import Graphics.Fenetre;
import Person.Person;

public class Launcher {

	public static void main(String args[]) {
		System.out.println("Nuit de l'info!!!");
		Person p1 = new Person();
		p1.setId(0);
		p1.setName("Jean Francois Lapiche");
		p1.afficher();

		Fenetre f = new Fenetre();
	}

}
