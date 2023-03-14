package model.selectedoption;

public class SelectedMenuInfo {
	
	int code;
	String name;
	boolean combo;
	String sideMenu = "선택없음";
	String beverage = "선택없음";
	String choice = "초이스";
	String sauce = "선택없음";
	String mari = "한마리";
	int price;
	int quantity = 1;
	String beverageSize = "M";
	
	
	
	
	public String getMari() {
		return mari;
	}
	public void setMari(String mari) {
		this.mari = mari;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCombo() {
		return combo;
	}
	public void setCombo(boolean combo) {
		this.combo = combo;
	}
	public String getSideMenu() {
		return sideMenu;
	}
	public void setSideMenu(String sideMenu) {
		this.sideMenu = sideMenu;
	}
	public String getBeverage() {
		return beverage;
	}
	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public String getBeverageSize() {
		return beverageSize;
	}
	public void setBeverageSize(String beverageSize) {
		this.beverageSize = beverageSize;
	}
	
	
	
	
	
	
	
}
