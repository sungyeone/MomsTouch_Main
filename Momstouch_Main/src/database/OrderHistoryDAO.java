package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.selectedoption.SelectedMenuInfo;

public class OrderHistoryDAO {
	
	static String mainOrderSql = "INSERT INTO main_order VALUES(1, main_order_seq.nextval, ?, ?)";
	static String menuOrderSql = "INSERT INTO menu_order VALUES(menu_order_seq.nextval, main_order_seq.currval, ?, ?, ?, ?)"; 
	
	public static void addOrderHistory(List<SelectedMenuInfo> selectedMenus) {
		
		Date date = new Date();
		SimpleDateFormat myDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss EE");
		String now = myDateFormat.format(date);
		
		int totalAmount = 0;
		for(SelectedMenuInfo selectedMenu : selectedMenus) {
			totalAmount += selectedMenu.getPrice();
		}
		
		try(
			Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(mainOrderSql);
			PreparedStatement pstmt2 = conn.prepareStatement(menuOrderSql);
			
		){ 
			pstmt.setString(1, now);
			pstmt.setInt(2, totalAmount);
			
			pstmt.executeQuery();
			
			
			for(SelectedMenuInfo selectedMenu : selectedMenus) {
				pstmt2.setInt(1, selectedMenu.getCode());
				pstmt2.setString(2, selectedMenu.getName());
				pstmt2.setInt(3, selectedMenu.getQuantity());
				pstmt2.setInt(4, selectedMenu.getPrice());
				pstmt2.executeQuery();
			}
			
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
