package com.bank.dao;

import java.sql.PreparedStatement;
import java.util.Scanner;

import com.bank.beans.CustomerInformation;

public class UserDaoimpl implements UserDao {

	CustomerInformation ci=new CustomerInformation();
	public void registration() {
		
		Scanner sc=new Scanner (System.in);
		PreparedStatement pst=con.prepareStatement("insert into CustomerDetails(firstName,lastName,emailId,pancardNo,aadharNo,address,MobileNo,RoomType,RoomNo) values (?,?,?,?,?,?,?,?,?)");
		pst.setString(1,ci.getFirstName());
		pst.setString(2,ci.getLastName());
		pst.setString(3,ci.getEmailId());
		pst.setLong(4,ci.getPancardNo());
		pst.setLong(5,ci.getAadharNo());
		pst.setString(6,ci.getAddress());
		pst.setLong(7,ci.getMobileNumber());
		pst.setString(8,ci.getAddress());
		pst.setString(9,ci.getAddress());
		
		pst.execute();

	}

	
	public void login() {
		
		
	}

}
