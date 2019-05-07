package service;

import java.util.Scanner;

import dao.IPizzaDao;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner s, IPizzaDao dao) {
		System.out.println("Veuillez choisir le code de la pizza à supprimer");
		String code = s.next();
		if(!dao.pizzaExists(code)) {
			System.out.println("Code inexistant");
		}
		else {
			dao.deletePizza(code);
			System.out.println("Suppression effective");
		}
	}

}
