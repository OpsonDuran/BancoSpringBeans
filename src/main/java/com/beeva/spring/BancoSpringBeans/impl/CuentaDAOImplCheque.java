package com.beeva.spring.BancoSpringBeans.impl;
/**
 * @author Armando Duran Salvador
 *
 */
import java.util.Calendar;

import com.beeva.spring.BancoSpringBeans.entity.Cliente;
import com.beeva.spring.BancoSpringBeans.inter.CuentaDAO;

public class CuentaDAOImplCheque implements CuentaDAO{

	//inicializa calendario y se asigna arreglo de los dias
		Calendar now = Calendar.getInstance();
		String[] strDays = new String[]{"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};

		public boolean Deposito(Cliente cliente, double dinero) {
			
			cliente.getCuenta().setBalance(cliente.getCuenta().getBalance()+dinero);
			return true;
		}

		public boolean Retiro(Cliente cliente, double dinero) {
			if(strDays[now.get(Calendar.DAY_OF_WEEK) - 1]!="Sabado" && strDays[now.get(Calendar.DAY_OF_WEEK) - 1]!="Domingo"){
				cliente.getCuenta().setBalance(cliente.getCuenta().getBalance()-dinero);
				return true;
			}
			return false;
		}

}
