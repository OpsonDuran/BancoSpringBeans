package com.beeva.spring.BancoSpringBeans.entity;
/**
 * @author Armando Duran Salvador
 *
 */
public class Cuenta {
	protected double balance;
	private int tipoCuenta;
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(int tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
}
