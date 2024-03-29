package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.domain.Fruit;

public interface FruitServices {
	
	    public void addFruit(Fruit fruit);
	    public void deleteFruit(int id);
	    public void updateFruit(Fruit fruit);
	    public Optional <Fruit> getFruitById(int id);
	    public List<Fruit> getAllFruit();

	}

