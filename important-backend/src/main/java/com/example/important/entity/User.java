package com.example.important.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "tb_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_pw")
	private String userPw;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_addr")
	private String userAddr;
	
	@Column(name = "join_date")
	private Date joinDate;
	
	@Column(name = "login_date")
	private Date loginDate;
	
	@Column(name = "user_status")
	@ColumnDefault("0") // 0 : »ηΏλ, 1 : ΐε±βΉΜ»ηΏλ, 2 : Ε»Επ
	private int userStatus;
	
	@Column(name = "user_role")
	private String userRole;
	
	@OneToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
}
