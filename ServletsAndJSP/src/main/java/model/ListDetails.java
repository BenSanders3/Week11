package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
@Entity
public class ListDetails {
	@Id
	@GeneratedValue
	private int id;
	private String listName;
	private LocalDate tripDate;
	@ManyToOne
	private Shopper shopper;
	private List<ListPart> listOfItems;
	
	public ListDetails() {
		super();
	}
	
	public ListDetails(int id, String listName, LocalDate tripDate, Shopper shopper, List<ListPart> listOfItems) {
		super();
		this.id = id;
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
		this.listOfItems = listOfItems;
	}
	
	
	public ListDetails(String listName, LocalDate tripDate, Shopper shopper, List<ListPart> listOfItems) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
		this.listOfItems = listOfItems;
	}
	
	
	public ListDetails(String listName, LocalDate tripDate, Shopper shopper) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	public LocalDate getTripDate() {
		return tripDate;
	}
	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}
	public Shopper getShopper() {
		return shopper;
	}
	public void setShopper(Shopper shopper) {
		this.shopper = shopper;
	}
	public List<ListPart> getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(List<ListPart> listOfItems) {
		this.listOfItems = listOfItems;
	}
	@Override
	public String toString() {
		return "ListDetails [id=" + id + ", listName=" + listName + ", tripDate=" + tripDate + ", shopper=" + shopper
				+ ", listOfItems=" + listOfItems + "]";
	}
	
}