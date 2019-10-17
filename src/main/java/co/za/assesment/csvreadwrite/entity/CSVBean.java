package co.za.assesment.csvreadwrite.entity;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class CSVBean {

	@CsvBindByName
	private String street;
	
	@CsvBindByName
	private String city;
	
	@CsvBindByName
	private int zip;
	
	@CsvBindByName
	private String state;
	
	@CsvBindByName
	private int beds;
	
	@CsvBindByName
	private int baths;
	
	@CsvBindByName
	private int squareFeet;
	
	@CsvBindByName
	private String type;
	
	@CsvDate(value = "E MMM dd HH:mm:ss Z yyyy")
	@CsvBindByName
	private Date saleDate;
	
	@CsvBindByName
	private double price;
	
	@CsvBindByName
	private float latitude;
	
	@CsvBindByName
	private float longitude;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}
	public int getBaths() {
		return baths;
	}
	public void setBaths(int baths) {
		this.baths = baths;
	}
	public int getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "CSVBean [street=" + street + ", city=" + city + ", zip=" + zip + ", state=" + state + ", beds=" + beds
				+ ", baths=" + baths + ", squareFeet=" + squareFeet + ", type=" + type + ", saleDate=" + saleDate
				+ ", price=" + price + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
}
