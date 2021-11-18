package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;


//	Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos em caixa alta.
public class ExemploFunction {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

//		Utilizando interface funcional com função map
		
//		A função "map" (não confunda com a estrutura de dados Map) é uma
//		função que aplica uma função a todos os elementos de uma stream.		
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());		
//		names.forEach(System.out::println);
		
		
//		Utilizando método estático
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());	
//		names.forEach(System.out::println);
		
//		Utilizando método não estático
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
//		names.forEach(System.out::println);
		
//		Expressão lambda declarada
//		
//		Function<Product, String> func = p -> p.getName().toUpperCase();
//		
//		List<String> names = list.stream().map(func).collect(Collectors.toList());
//		
//		names.forEach(System.out::println);
		
//		Expressão lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
	}

}
