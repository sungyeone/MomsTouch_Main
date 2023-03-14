package selectoption_page.component.fourthPageInPane.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.OjdbcConnection;
import selectoption_page.component.fourthPageInPane.add.menuInfo.SideInfo;

public class SideDAO {
	

	public static SideInfo[] getSideInfo() {
		String sideListInfo = "SELECT side_menu_name, side_menu_price, side_menu_link FROM side_list";
		String countSide = "SELECT count(*) FROM side_list";
		SideInfo[] sideInfo = null;

		try (Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt1 = conn.prepareStatement(countSide);
				PreparedStatement pstmt2 = conn.prepareStatement(sideListInfo);
				ResultSet rs1 = pstmt1.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();) {

			int numberOfSide = 0;
			while (rs1.next()) {
				numberOfSide = rs1.getInt("count(*)");
			}
			sideInfo = new SideInfo[numberOfSide];
			
			for (int i = 0; i < numberOfSide; ++i) {
				sideInfo[i] = new SideInfo();
			}
			
			int i = 0;
			while(rs2.next()) {
				sideInfo[i].setSideName(rs2.getString("side_menu_name"));
				sideInfo[i].setPrice(rs2.getInt("side_menu_price"));
				sideInfo[i].setSidePath(rs2.getString("side_menu_link"));
				i++;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return sideInfo;
	}
	
}
