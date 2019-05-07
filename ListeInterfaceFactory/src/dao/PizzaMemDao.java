package dao;

import java.util.List;

import java.util.Vector;

import model.Pizza;

public class PizzaMemDao implements IPizzaDao {

	private List<Pizza> listPizza;
	
	public PizzaMemDao(){
		listPizza = new Vector<>();
	}
	
	@Override
	public List<Pizza> findAllPizzas() {
		return listPizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		listPizza.add(pizza);
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		int i = 0;
		while(!listPizza.get(i).getCode().equalsIgnoreCase(codePizza)) {
			i++;
		}
		listPizza.set(i, pizza);
	}

	@Override
	public void deletePizza(String codePizza) {
		int i = 0;
		while(!listPizza.get(i).getCode().equalsIgnoreCase(codePizza)) {
			i++;
		}
		listPizza.remove(i);
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		int i = 0;
		while(!listPizza.get(i).getCode().equalsIgnoreCase(codePizza)) {
			i++;
		}
		return listPizza.get(i);
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		for(int i = 0; i < listPizza.size(); i++) {
			if(listPizza.get(i).getCode().equalsIgnoreCase(codePizza)) {
				return true;
			}
		}
		return false;
	}

}
