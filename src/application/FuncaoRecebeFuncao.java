package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductService;

//	Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços somente dos produtos cujo nome começa com "T".
public class FuncaoRecebeFuncao {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();

		list.forEach(System.out::println);
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum: " + String.format("R$%.2f", sum));
	}

}
