package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.BeverageInfo;
import model.BonelessChickenInfo;
import model.BurgerInfo;
import model.ChickenInfo;
import model.MomsSetInfo;
import model.SideMenuInfo;

public class MenuDAO {

	public static BurgerInfo[] getBurgerInfo() {
		String menuInfo = "SELECT * FROM burger_list ORDER BY burger_code";
		String countBurger = "SELECT count(burger_code) FROM burger_list";
		BurgerInfo[] burgerInfo = null;
		
		try(
			Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(countBurger);
			PreparedStatement pstmt2 = conn.prepareStatement(menuInfo);
			ResultSet rs = pstmt.executeQuery();
		    ResultSet rs2 = pstmt2.executeQuery();
		){
			int numberOfBurgers = 0; 
			while(rs.next()) {
				numberOfBurgers = rs.getInt("count(burger_code)");
			}
			burgerInfo = new BurgerInfo[numberOfBurgers];			
			
			for(int i = 0; i < numberOfBurgers; i++) {
				burgerInfo[i] = new BurgerInfo();
			}
			
			int i = 0;
				while(rs2.next()) {
					
					burgerInfo[i].setBurger_code(rs2.getInt("burger_code"));
					burgerInfo[i].setBurger_name(rs2.getString("burger_name"));
					burgerInfo[i].setBurger_price(rs2.getInt("burger_price"));
					burgerInfo[i].setCombo_price(rs2.getInt("combo_price"));
					burgerInfo[i].setBurger_image_link(rs2.getString("burger_image_link"));
					burgerInfo[i].setCombo_image_link(rs2.getString("combo_image_link"));
					burgerInfo[i].setBurger_image_link2(rs2.getString("burger_image_link2"));
					burgerInfo[i].setBurger_info(rs2.getString("burger_info"));
					i++;
				}					
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return burgerInfo;
	}
	
	public static ChickenInfo[] getChickenInfo() {
		String menuInfo = "SELECT * FROM chicken_list ORDER BY chicken_code";
		String countChicken = "SELECT count(chicken_code) FROM chicken_list";
		ChickenInfo[] chickenInfo = null;
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(countChicken);
				PreparedStatement pstmt2 = conn.prepareStatement(menuInfo);
				ResultSet rs = pstmt.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();
				){
			int numberOfChickens = 0; 
			while(rs.next()) {
				numberOfChickens = rs.getInt("count(chicken_code)");
			}
			chickenInfo = new ChickenInfo[numberOfChickens];			
			
			for(int i = 0; i < numberOfChickens; i++) {
				chickenInfo[i] = new ChickenInfo();
			}
			
			int i = 0;
			while(rs2.next()) {
				
				chickenInfo[i].setChicken_code(rs2.getInt("chicken_code"));
				chickenInfo[i].setChicken_name(rs2.getString("chicken_name"));
				chickenInfo[i].setChicken_price(rs2.getInt("chicken_price"));
				chickenInfo[i].setChicken_image_link(rs2.getString("chicken_image_link"));
				chickenInfo[i].setChicken_image_link2(rs2.getString("chicken_image_link2"));
				chickenInfo[i].setChicken_info(rs2.getString("chicken_info"));
				i++;
			}					
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return chickenInfo;
	}
	
	public static BonelessChickenInfo[] getBonelessChickenInfo() {
		String menuInfo = "SELECT * FROM boneless_chicken_list ORDER BY boneless_chicken_code";
		String countBonelessChicken = "SELECT count(boneless_chicken_code) FROM boneless_chicken_list";
		BonelessChickenInfo[] bonelessChickenInfo = null;
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(countBonelessChicken);
				PreparedStatement pstmt2 = conn.prepareStatement(menuInfo);
				ResultSet rs = pstmt.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();
				){
			int numberOfBonelessChickens = 0; 
			while(rs.next()) {
				numberOfBonelessChickens = rs.getInt("count(boneless_chicken_code)");
			}
			bonelessChickenInfo = new BonelessChickenInfo[numberOfBonelessChickens];			
			
			for(int i = 0; i < numberOfBonelessChickens; i++) {
				bonelessChickenInfo[i] = new BonelessChickenInfo();
			}
			
			int i = 0;
			while(rs2.next()) {
				
				bonelessChickenInfo[i].setBoneless_chicken_code(rs2.getInt("boneless_chicken_code"));
				bonelessChickenInfo[i].setBoneless_chicken_name(rs2.getString("boneless_chicken_name"));
				bonelessChickenInfo[i].setBoneless_chicken_price(rs2.getInt("boneless_chicken_price"));
				bonelessChickenInfo[i].setBoneless_chicken_image_link(rs2.getString("boneless_chicken_image_link"));
				bonelessChickenInfo[i].setBoneless_chicken_image_link2(rs2.getString("boneless_chicken_image_link2"));
				bonelessChickenInfo[i].setBoneless_chicken_info(rs2.getString("boneless_chicken_info"));
				i++;
			}					
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return bonelessChickenInfo;
	}
	
	
	public static SideMenuInfo[] getSideMenuInfo() {
		String menuInfo = "SELECT * FROM side_list ORDER BY side_menu_code";
		String countSideMenu = "SELECT count(side_menu_code) FROM side_list";
		SideMenuInfo[] sideMenuInfo = null;
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(countSideMenu);
				PreparedStatement pstmt2 = conn.prepareStatement(menuInfo);
				ResultSet rs = pstmt.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();
				){
			int numberOfSideMenu = 0; 
			while(rs.next()) {
				numberOfSideMenu = rs.getInt("count(side_menu_code)");
			}
			sideMenuInfo = new SideMenuInfo[numberOfSideMenu];			
			
			for(int i = 0; i < numberOfSideMenu; i++) {
				sideMenuInfo[i] = new SideMenuInfo();
			}
			
			int i = 0;
			while(rs2.next()) {
				
				sideMenuInfo[i].setSide_menu_code(rs2.getInt("side_menu_code"));
				sideMenuInfo[i].setSide_menu_name(rs2.getString("side_menu_name"));
				sideMenuInfo[i].setSide_menu_price(rs2.getInt("side_menu_price"));
				sideMenuInfo[i].setSide_menu_link(rs2.getString("side_menu_link"));
				sideMenuInfo[i].setSide_menu_link2(rs2.getString("side_menu_link2"));
				i++;
			}					
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return sideMenuInfo;
	}
	
	public static MomsSetInfo[] getMomsSetInfo() {
		String menuInfo = "SELECT * FROM moms_set_list ORDER BY moms_set_code";
		String countMomsSet = "SELECT count(moms_set_code) FROM moms_set_list";
		MomsSetInfo[] momsSetInfo = null;
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(countMomsSet);
				PreparedStatement pstmt2 = conn.prepareStatement(menuInfo);
				ResultSet rs = pstmt.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();
				){
			int numberOfMomsSet = 0; 
			while(rs.next()) {
				numberOfMomsSet = rs.getInt("count(moms_set_code)");
			}
			momsSetInfo = new MomsSetInfo[numberOfMomsSet];			
			
			for(int i = 0; i < numberOfMomsSet; i++) {
				momsSetInfo[i] = new MomsSetInfo();
			}
			
			int i = 0;
			while(rs2.next()) {
				
				momsSetInfo[i].setMoms_set_code(rs2.getInt("moms_set_code"));
				momsSetInfo[i].setMoms_set_name(rs2.getString("moms_set_name"));
				momsSetInfo[i].setMoms_set_price(rs2.getInt("moms_set_price"));
				momsSetInfo[i].setMoms_set_link(rs2.getString("moms_set_link"));
				momsSetInfo[i].setMoms_set_link2(rs2.getString("moms_set_link2"));
				momsSetInfo[i].setMoms_set_info(rs2.getString("moms_set_info"));
				i++;
			}					
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return momsSetInfo;
	}
	
	public static BeverageInfo[] getBeverageInfo() {
		String menuInfo = "SELECT * FROM beverage_list ORDER BY beverage_code";
		String countBeverage = "SELECT count(beverage_code) FROM beverage_list";
		BeverageInfo[] beverageInfo = null;
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(countBeverage);
				PreparedStatement pstmt2 = conn.prepareStatement(menuInfo);
				ResultSet rs = pstmt.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();
				){
			int numberOfBeverage = 0; 
			while(rs.next()) {
				numberOfBeverage = rs.getInt("count(beverage_code)");
			}
			beverageInfo = new BeverageInfo[numberOfBeverage];			
			
			for(int i = 0; i < numberOfBeverage; i++) {
				beverageInfo[i] = new BeverageInfo();
			}
			
			int i = 0;
			while(rs2.next()) {
				
				beverageInfo[i].setBeverage_code(rs2.getInt("beverage_code"));
				beverageInfo[i].setBeverage_name(rs2.getString("beverage_name"));
				beverageInfo[i].setBeverage_price(rs2.getInt("beverage_price"));
				beverageInfo[i].setBeverage_link(rs2.getString("beverage_link"));
				beverageInfo[i].setBeverage_link2(rs2.getString("beverage_link2"));
				i++;
			}					
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return beverageInfo;
	}
	
	
}
