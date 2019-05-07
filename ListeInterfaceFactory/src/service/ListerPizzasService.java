package service;

import java.util.List;

import java.util.Scanner;

import dao.IPizzaDao;

import model.Pizza;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner s, IPizzaDao dao) {
		List<Pizza> listPizza = dao.findAllPizzas();
		for(Pizza p : listPizza) {
			System.out.println(p.getCode() + " -> " + p.getLibelle() + " (" + String.format("%.2f", p.getPrix()) + "€)");
		}
	}

}
