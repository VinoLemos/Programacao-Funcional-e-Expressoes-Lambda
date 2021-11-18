package util;

import java.util.function.Function;

import entities.Product;

//	Function recebe um objeto de entrada e um objeto de saída Function<Entrada, saída>()
public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
