package com.beeva.spring.BancoSpringBeans.store;
/**
 * @author Armando Duran Salvador
 *
 */
import com.beeva.spring.BancoSpringBeans.entity.Cliente;

public class Banco {
	private Cliente[] clientes= new Cliente[10];
	private int nClientes=0;
	
	public boolean AddCliente(Cliente cliente){
		if(nClientes<10){
		clientes[nClientes]=cliente;	
		nClientes++;
		return true;
		}
		return false;
	}

	public int getnClientes() {
		return nClientes;
	}
	public Cliente getCliente(int i){
		return clientes[i];
	}

}
