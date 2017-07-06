package com.beeva.spring.BancoSpringBeans;
/**
 * @author Armando Duran Salvador
 *
 */

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("BancoBeans.xml");
    	context.getBean("Banco");
    	
    	/*
    	 * Beans SpringBeans
    	 * 
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml"); 
    	Banco banco =(Banco) context.getBean("Banco");
    	Cuenta cuenta=(Cuenta) context.getBean("Cuenta");
    	Cliente cliente =(Cliente) context.getBean("Cliente");
        CuentaFactory cuentaFactory = (CuentaFactory) context.getBean("Factory");
    	
    	Scanner lectura = new Scanner(System.in);
		double num,dinero;
		String nombre,apellido;
		int tipocuenta,id,opcion;

		//Ingresar usuarios

				System.out.print("numero de usuarios a ingresar: ");
				num=lectura.nextInt();
				System.out.println("---------------");
				lectura.nextLine();
				Banco usuarios= new Banco();

				for(int i=0;i<num;i++){
					System.out.println("Ingresa usuario "+(i+1));
					System.out.println("---------------");
					System.out.print("Nombre:");
					nombre=lectura.nextLine();
					System.out.print("Apellido:");
					apellido=lectura.nextLine();
					System.out.println("---------------");
					System.out.println("Tipos de Cuenta");
					System.out.println("Tipo Ahorro->1");
					System.out.println("Tipo Cheques->2");
					System.out.println("---------------");
					System.out.print("Tipo de Cuenta:");
				    tipocuenta=lectura.nextInt();
				    lectura.nextLine();
					System.out.print("Saldo inicial: $");
				    dinero=lectura.nextDouble();
				    lectura.nextLine();
			        cuenta.setBalance(dinero);
			        cuenta.setTipoCuenta(tipocuenta);
			        cliente.setNombre(nombre);
			        cliente.setApellido(apellido);
			        cliente.setCuenta(cuenta);
			        usuarios.AddCliente(cliente);
					System.out.println("---------------");
				}

				System.out.println("---------------");
				System.out.println("Numero de clientes "+ usuarios.getnClientes());
				System.out.println("---------------");
				System.out.println("Informacion del cliente:");
				for(int i=0;i<usuarios.getnClientes();i++){
				System.out.println("Nombre:" +usuarios.getCliente(i).nombre+" "+usuarios.getCliente(i).apellido+"| Tipo cuenta: "+usuarios.getCliente(i).getCuenta().getTipoCuenta()+" | Saldo: $"+usuarios.getCliente(i).getCuenta().getBalance());
				System.out.println("------------------------------------------------");
				}

				// Cajero
				System.out.println("---Cajero---");
				System.out.println("Ingresa usuario");
				System.out.println("---------------");
				System.out.print("Id: ");
				id=lectura.nextInt();
				while(true){
					System.out.println("Informacion del cliente:");
					System.out.println("Nombre: " +usuarios.getCliente(id).nombre+" "+usuarios.getCliente(id).apellido+"| Tipo cuenta: "+usuarios.getCliente(id).getCuenta().getTipoCuenta()+" | Saldo: $"+usuarios.getCliente(id).getCuenta().getBalance());
					System.out.println("------------------------------------------------");
					System.out.println("Opciones");
					System.out.println("1----Deposito");
					System.out.println("2----Retiro");
					System.out.println("---------------");
			        System.out.print("Seleccione una opcion: ");
			        opcion= lectura.nextInt();
			        CuentaDAO cuentaDAO =  cuentaFactory.getImplements(usuarios.getCliente(id).getCuenta());
			    	switch (opcion) {
					case 1:

						System.out.println("----------");
						System.out.println("Deposito");
						System.out.print("Catidad a depositar: ");
					    dinero= lectura.nextDouble();
				        cuentaDAO.Deposito(usuarios.getCliente(id), dinero);
						System.out.println("Saldo "+usuarios.getCliente(id).getCuenta().getBalance());
						System.out.println("----------");

						break;
					case 2:
						System.out.println("----------");
						System.out.println("Retiro");
						System.out.print("Catidad a retirar: ");
					    dinero= lectura.nextDouble();
					    if(cuentaDAO.Retiro(usuarios.getCliente(id), dinero)==true){
							System.out.println("Saldo "+usuarios.getCliente(id).getCuenta().getBalance());
							System.out.println("----------");
					    }else{
							System.out.println("Saldo insuficiente o Dia inabil");
							System.out.println("----------");
					    }
						break;

					default:
					    break;
			    	}}
    	*/
    	
    }
}
