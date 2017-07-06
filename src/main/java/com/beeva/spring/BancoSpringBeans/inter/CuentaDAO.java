package com.beeva.spring.BancoSpringBeans.inter;
/**
 * @author Armando Duran Salvador
 *
 */
import com.beeva.spring.BancoSpringBeans.entity.Cliente;


public interface CuentaDAO {
	public boolean Deposito(Cliente cliente,double dinero);
	public boolean Retiro(Cliente cliente,double dinero);
}
