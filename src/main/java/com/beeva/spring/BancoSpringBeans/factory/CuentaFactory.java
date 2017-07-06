package com.beeva.spring.BancoSpringBeans.factory;
/**
 * @author Armando Duran Salvador
 *
 */
import com.beeva.spring.BancoSpringBeans.entity.Cuenta;
import com.beeva.spring.BancoSpringBeans.impl.CuentaDAOImplAhorro;
import com.beeva.spring.BancoSpringBeans.impl.CuentaDAOImplCheque;
import com.beeva.spring.BancoSpringBeans.inter.CuentaDAO;


public class CuentaFactory {
	public CuentaDAO  getImplements(Cuenta cuenta){
		if(cuenta.getTipoCuenta()==1){
			CuentaDAO account = new CuentaDAOImplAhorro();
			return account ;
		}else{
			CuentaDAO account = new CuentaDAOImplCheque();
			return account;
		}
	}

}
