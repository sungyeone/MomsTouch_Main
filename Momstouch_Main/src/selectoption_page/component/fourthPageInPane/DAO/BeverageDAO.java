package selectoption_page.component.fourthPageInPane.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.OjdbcConnection;
import selectoption_page.component.fourthPageInPane.add.menuInfo.BeverageInfo;
import selectoption_page.component.fourthPageInPane.add.menuInfo.SideInfo;

public class BeverageDAO {

	
	public static BeverageInfo[] getBeverageInfo() {
		String beverageListInfo = "SELECT beverage_name, beverage_price, beverage_link FROM beverage_list";
		String countBeverage = "SELECT count(*) FROM beverage_list";
		BeverageInfo[] beverageInfo = null;
		
		try (Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt1 = conn.prepareStatement(countBeverage);
				PreparedStatement pstmt2 = conn.prepareStatement(beverageListInfo);
				ResultSet rs1 = pstmt1.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();){
			
			int numberOfBeverage = 0;
			while(rs1.next()) {
				numberOfBeverage = rs1.getInt("count(*)");
			}
			beverageInfo = new BeverageInfo[numberOfBeverage];
			
			for (int i = 0; i < numberOfBeverage; ++i) {
				beverageInfo[i] = new BeverageInfo();
			}
			
			int i = 0;
			while(rs2.next()) {
				beverageInfo[i].setBeverageName(rs2.getString("beverage_name"));
				beverageInfo[i].setPrice(rs2.getInt("beverage_price"));
				beverageInfo[i].setBeveragePath(rs2.getString("beverage_link"));
				i++;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return beverageInfo;
	}
	

}
