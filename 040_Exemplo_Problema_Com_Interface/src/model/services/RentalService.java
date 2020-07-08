package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService brTaxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService brTaxService) {
		super();
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.brTaxService = brTaxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long start = carRental.getStart().getTime(); //Pega a hora em ms
		long finish = carRental.getFinish().getTime();
		double hours = (double)(finish - start) / 1000 / 60 / 60;
		double basicPayment;
		
		if (hours <= 12) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = brTaxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
