/*
 * PROYECTO POR ALUMNO JOAQUIN PADRON
 * 
 * EN EL SIGUIENTE SISTEMA DE GESTION DDE PRODUCTOS DE LA TIENDA 'CANDY SHOP' SE TOMARAN DISTINTOS CONCEPTOS E IDEAS PARA
 * RESOLVER LA PROBLEMATICA PLANTEADA EN EL TRABAJO PRACTICO NUMERO 1.
 * 
 * MUCHAS FUNCIONALIDADES PUEDEN MEJORARSE SEGUN LAS NESECIDADES O GUSTOS DEL CLIENTE O DESDE LA CALIFICACION O PUNTO DE 
 * VISTA DEL PROFESOR, PERSONALMENTE INTERPRETO QUE: 
 * 
 * TODOS LOS VALORES INGRESADOS POR TECLADO LOS CUALES SEAN ELECCIONES
 * SEAN NUMERICAS, ELIGIENDO EL NUMERO INDICADO EN EL PARENTESIS (EJEMPLO '1)') Y NO SE INGRESARAN CADENAS DE CARACTERES
 * SI NO ES INDICADO (COMO PUEDE SER UN NOMBRE DE PRODUCTO). SI ESTA CONDICION NO SE CUMPLE O DARA ERROR POR TIPO DE DATO
 * O AL NO INGRESAR EN LA OPCION DESEADA ROMPERIA EL FLUJO DEL PROGRAMA.
 * 
 * VARIAS DE LAS CLASES, METODOS Y OBJETOS A UTILIZAR SE CAMBIARON DE LA IDEA DEL TRABAJO PRACTICO 1 YA QUE LA IDEA DEL 
 * TRABAJO PRACTICO NUMERO 1 TENIA ERRORES EN CIERTAS IDEAS, CONCEPTOS Y RAZONAMIENTOS (COMO POR EJEMPLO EL METODO 
 * ACTUALIZARTABLA EL CUAL ESTABA PENSADO PARA ACTUALIZAR LATABLA DE UNA INTERFAZ, PERO EN ESTE CASO NO ES NECESARIO YA
 * QUE SE IMPRIME POR CONSOLA) 
 * 
 * */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //CLASE PRINCIPAL
		
		Scanner sc = new Scanner(System.in);//LLAMO LA CLASE SCANNER
		
		Producto willyWonka = new Producto("Willy Wonka", "Chocolate", 100.0, 0, 0);//DEFINO LOS TRES PRIMERO OBJETOS DE LA LISTA
		
		Producto mediaHora = new Producto("Media Hora", "Caramelo", 10.0, 0, 1);
		
		Producto bazooka = new Producto("Bazooka", "Chicle", 20.0, 0, 2);
		
		Inventario inventario = new Inventario();//CREO LA LA LISTA CON LOS TRES ELEMENTOS DEL INVENTARIO POR DEFECTO
		
		inventario.getListaInventario().add(willyWonka);
		
		inventario.getListaInventario().add(mediaHora);
		
		inventario.getListaInventario().add(bazooka);
		
		MetodoDePago metodoDePago = new MetodoDePago();//INSTANCIO EL METODO DE PAGO
		
		boolean salir = true;//DECLARO E INICIALIZO LA CONDICI0N DE CORTE DE LA ITERACION
		
		Integer auxiliar = 0;//DECLARO UN AUXILIAR
		
		Integer opcion = 0;//DECLARO UN AUXILIAR PARA LAS OPCIONES POR TECLADO
		
		//INICIO EL MENU INTERACTIVO
		
		System.out.println("SISTEMA DE COBRO CANDY SHOP!");
		
		do {
			
			System.out.println("");
			
			System.out.println("Indique operacion deseada:");
			
			System.out.println("");
			
			System.out.println("1) Comprar Chocolate Willy Wonka");
			
			System.out.println("2) Comprar Caramelo Media hora");
			
			System.out.println("3) Comprar Chicle Bazooka");
			
			System.out.println("4) Mostrar inventario");
			
			System.out.println("5) Agregar nuevo producto");
			
			System.out.println("6) Comprar golosina por ID");
			
			System.out.println("7) Realizar pago final");
			
			System.out.println("");//ELIGO UNA OPCION NUMERICA ENTERA

			int opciones = sc.nextInt();
			
			System.out.println("");
			
			switch (opciones) {//MUESTRO LAS POSIBILIDADES EN CADA CASO
			
			case 1: //ELIJO COMPRAR CHOCOLATE
				
				System.out.println("Indique la cantidad a comprar");
				
				auxiliar = inventario.getListaInventario().get(0).getCantidad();//CARGO EN UNA VARIABLE AUXILIAR EL VALOR PREVIO DE LA CANTIDAD DEL PRODUCTO
				
				inventario.getListaInventario().get(0).setCantidad((auxiliar) + (sc.nextInt())); //ASIGNO A LA NUEVA CANTIDAD EL VALOR DESEADO MAS LA CANTIDAD ANTERIOR
				
				break;
			
			case 2: //ELIJO COMPRAR CARAMELO
				
				System.out.println("Indique la cantidad a comprar");
				
				auxiliar = inventario.getListaInventario().get(1).getCantidad();
				
				inventario.getListaInventario().get(1).setCantidad((auxiliar) + (sc.nextInt())); 
				
				break;
				
			case 3: //ELIJO COMPRAR CHICLE
				
				System.out.println("Indique la cantidad a comprar");
				
				auxiliar = inventario.getListaInventario().get(2).getCantidad();
				
				inventario.getListaInventario().get(2).setCantidad((auxiliar) + (sc.nextInt())); 
				
				break;
				
			case 4: //MUESTRO EL INVENTARIO
				
				inventario.mostrarInventario();//USO EL METODO MOSTRARINVENTARIO DEL OBJETO INVENTARIO
				
				break;
				
			case 5: //AGREGO UN NUEVO PRODUCTO A LA LISTA
				
				System.out.println("Indique nombre del producto:");

				String nombre = sc.next();
				
				System.out.println("");
				
				sc.nextLine();
				
				//************************************************************
				
				System.out.println("Indique tipo del producto:");
				
				String tipo = sc.nextLine();
				
				System.out.println("");	
				
				//************************************************************
				
				System.out.println("Indique precio del producto:");
				
				double precio = sc.nextDouble();
				
				System.out.println("");
				
				//************************************************************
				
				Integer id = inventario.getListaInventario().size();//AIGNO AL ID EL VALOR DEL LA LONGITUD DE LA LISTA
				
				inventario.getListaInventario().add(new Producto(nombre,tipo,precio,0, id));//AGREGO EL PRODUCTO A LA LISTA CON LOS VALORES RECIEN INGRESADOS

				break;
				
			case 6: //COBRO LA COMPRA
				
				System.out.println("¿Desea ver el inventario?");//POR CUESTIONES DE PRACTISIDAD SOBRE LA OPERACION A REALIZAR CONSULTO NUEVAMENTE SI SE REQUIERE VISUALIZAR EL INVENTARIO
				
				System.out.println("");
				
				System.out.println("1) Si");
				
				System.out.println("2) No");
				
				System.out.println("");
				
				opcion = sc.nextInt();
				
				while (opcion != 1 && opcion != 2) {//BUCLE PARA VERIFICAR QUE LOS VALORES NUMERICOS SEAN EXPLICITAMENTE 1 O 2
					
					System.out.println("");
					
					System.out.println("1) Si");
					
					System.out.println("2) No");
					
					System.out.println("");
					
					opcion = sc.nextInt();
					
				};
				
				if (opcion == 1) {
					
					inventario.mostrarInventario();
					
					opcion = 0; //VUELVO A DAR EL VALOR 0 A LA VARIABLE PARA PODER USARLA DENUEVO
				};
				
				System.out.println("");
				
				System.out.println("Indique el ID de la golosina a comprar:");
				
				System.out.println("");
				
				Integer varId = sc.nextInt();//INDICO POR TECLADO EL ID ELEGIDO
				
				System.out.println("");
				
				System.out.println("Indique la cantidad a comprar:");
				
				System.out.println("");
				
				auxiliar = inventario.getListaInventario().get(varId).getCantidad();//CARGO EN UNA VARIABLE AUXILIAR EL VALOR PREVIO DE LA CANTIDAD DEL PRODUCTO
				
				inventario.getListaInventario().get(varId).setCantidad((auxiliar) + (sc.nextInt())); //ASIGNO A LA NUEVA CANTIDAD EL VALOR DESEADO MAS LA CANTIDAD ANTERIOR

				break;
				
			case 7:
				
				opcion = 0;//ASIGNO EL VALOR 0 A LA VARIABLE PARA ELIMINAR CUALQUIER PREVIO VALOR
				
				System.out.println("");
				
				System.out.println("Indique metodo de pago:");
				
				System.out.println("");
				
				System.out.println("1) Efectivo");
				
				System.out.println("");
				
				System.out.println("2) Tarjeta de debito");
				
				System.out.println("");
				
				System.out.println("3) Tarjeta de credito");
				
				System.out.println("");
				
				opcion = sc.nextInt();//INDICO POR TECLADO LA ELECCION
				
				switch(opcion) {
				
				case 1: //LE CARGO LA LISTA A EL METODO PAGOCONEFECTIVO AL AOBJETO METODODEPAGO ASI SE PUEDEN TRABAJAJR LOS VALORES
					
					metodoDePago.pagoConEfectivo(inventario.getListaInventario());
					
					break;
					
				case 2://LE CARGO LA LISTA A EL METODO PAGOCONDEBITO AL AOBJETO METODODEPAGO ASI SE PUEDEN TRABAJAJR LOS VALORES
					
					metodoDePago.pagoConDebito(inventario.getListaInventario());
					
					break;
					
				case 3: //LE CARGO LA LISTA A EL METODO PAGOCONCREDITO AL AOBJETO METODODEPAGO ASI SE PUEDEN TRABAJAJR LOS VALORES
					
					metodoDePago.pagoConCredito(inventario.getListaInventario());
					
					break;					
					
				};
				
				opcion = 0;//ASIGNO EL VALOR 0 A LA VARIABLE PARA PODER TRABAJJAR LA VARIABLE DE OTRA FORMA
				
				while (opcion != 1 && opcion != 2) {
				
				System.out.println("¿Desea finalizar la operacion?");
				
				System.out.println("");
				
				System.out.println("1) Si");
				
				System.out.println("2) No");
				
				System.out.println("");
				
				opcion = sc.nextInt();//ELIJO LA OPCION
				
				};
				
				if(opcion == 1) {					
					
					salir = false;//REALIZO LA CONDICION DE CORTE DEL BUCLE

				};
							
				break;
				
			};
		
		} while (salir);//VERIFICO LA CONDICION DE CORTE POR SI DEBE TERMINAR EL PROGRAMA
		
		System.out.println("");
		
		System.out.println("Hasta pronto! fin de la ejecución");
		
		sc.close();//CIERRO LA VARIABLE CONTENEDORA DE SCANNER
	
	}

}
