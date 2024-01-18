package ro.emanuel.crafty.pojo;

import java.sql.Date;

public class Crafts {
	private int id;
	private String name;
	private int amount;
	private int price;
	private Date manufactured;
	public Crafts(int id, String name, int amount, int price, Date manufactured) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.manufactured = manufactured;
	}
	
	
	
	public Crafts() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getManufactured() {
		return manufactured;
	}
	public void setManufactured(Date manufactured) {
		this.manufactured = manufactured;
	}
	
}
