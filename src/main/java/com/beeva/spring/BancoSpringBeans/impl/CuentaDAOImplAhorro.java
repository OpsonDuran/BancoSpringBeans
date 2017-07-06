package com.beeva.spring.BancoSpringBeans.impl;
/**
 * @author Armando Duran Salvador
 *
 */
import com.beeva.spring.BancoSpringBeans.entity.Cliente;
import com.beeva.spring.BancoSpringBeans.inter.CuentaDAO;

public class CuentaDAOImplAhorro implements CuentaDAO{

	public boolean Deposito(Cliente cliente, double dinero) {
		
		cliente.getCuenta().setBalance(cliente.getCuenta().getBalance()+dinero);
		return true;
	}

	public boolean Retiro(Cliente cliente, double dinero) {
		if(cliente.getCuenta().getBalance()>5000){
			cliente.getCuenta().setBalance(cliente.getCuenta().getBalance()-dinero);
			return true;
		}
		return false;
	}
}
