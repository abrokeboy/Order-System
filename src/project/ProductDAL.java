package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAL {
	
	
	private ArrayList<Products> products;
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement prepStatement = null;
	private ResultSet resultSet = null;
	
	public ProductDAL() {
		products = new ArrayList<>();
	}
	
	//get all the records from Products table
	public ArrayList<Products> getAll(){
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/myStore","root", "Jordan20");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("Select * from products");
			System.out.println();
			while(resultSet.next()) {
				System.out.println(resultSet.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
		
	}
		//add a product to the db
	public void addProduct(Products p) {
		if (p != null) {
			products.add(p);
		}
	}
	public ArrayList<Products> searchByName(String name) {
		ArrayList<Products> results = new ArrayList<>();
		if (products != null) {
			//loop through all products
		 for (Products products : products) {
			 if (products.getName().contains(name)) {
				 results.add(products);
			 }
		 }
		}
		
		return products;
	}
	public void printAll() {
		for (Products product : products) {
			System.out.println(product.getName() +" " + product.getProductID());
		}
	}
}
