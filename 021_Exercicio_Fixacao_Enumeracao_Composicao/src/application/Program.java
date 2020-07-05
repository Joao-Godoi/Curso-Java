package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = ent.nextLine();
		
		System.out.print("Email: ");
		String email = ent.next();
		
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(ent.next());
		System.out.println();
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(ent.next());
		
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order: ");
		int n = ent.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i +" item data: ");
			System.out.print("Product name: ");
			ent.nextLine();
			String productName = ent.nextLine();
			
			System.out.print("Product price: ");
			double priceProduct = ent.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = ent.nextInt();
			
			Product product = new Product(productName, priceProduct);
			
			OrderItem orderItem = new OrderItem(quantity, priceProduct, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("Order Summary: ");
		System.out.println(order);
		
		ent.close();
	}

}
