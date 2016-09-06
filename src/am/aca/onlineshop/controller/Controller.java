package am.aca.onlineshop.controller;
import implementations.Product;
import common.model.User;
import enums.ShippingType;
import productrepository.ProductRepository;
import userrepository.UserRepository;

public class Controller {
	
	
/*
	Shipment{
		Shiping type +
		Shipping address +}
		3.order (zakaz){
		List<lineItem>,
		User
		Card
		Shipment
		
		}
		4,lineItem<product, count>
		5.Inventory<product,Id, count>
		*/
	User user;
	Product product;
	ProductRepository productRepo;
	UserRepository userRepo;
	
	public boolean Shipment(ShippingAddress shipAddress, ShippingType shipType){
	
		
	}
	LineItem()
	Inventory(Product product, int productId, )
	Order()
}
