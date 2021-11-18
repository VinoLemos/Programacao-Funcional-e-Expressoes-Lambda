package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;


//	Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço mínimo seja 100.
public class ExemploPredicate {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
//		Utilizando expressão lambda com predicado
//		list.removeIf(p -> p.getPrice() >= 100);
		
//		Utilizando interface funcional Predicate
//		list.removeIf(new ProductPredicate());
	
//		Utilizando método estático da classe Product
//		Product:: referencia a localização do método, que se encontra na classe Product
//		list.removeIf(Product::staticProductPredicate);

//		Utilizando método não estático da classe Product		
//		list.removeIf(Product::nonStaticProductPredicate);
		
//		Utilizando expressão lambda declarada	
//		Predicate<Product> pred = p -> p.getPrice() >= 100.00;
//		list.removeIf(pred);

//		Utilizando expressão Lambda Inline
		double min = 100.00;
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
