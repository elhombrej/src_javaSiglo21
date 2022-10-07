import java.util.ArrayList;//IMPORTO LA LIBRERIA DE ARRAYLIST
import java.util.List;//IMPORTO LA LIRERIA DE LIST
import java.util.Scanner;//IMPORTO LA LIBRERIA DE SCANNER(COMO SE MUESTRA EN LA CONFERENCIA)

public class MetodoDePago {//CREO LA CLASE METODO DE PAGO DONDE SE REALIZARAN LAS OPERACIONES SOBRE LOS METODOS DE PAGO
	
	Scanner sc = new Scanner(System.in);//ASIGNO A UNA VARIABLE SCANNER EL CUAL PERMITIRA INGRESAR DATOS POR TECLADO

	List<Producto> listaInventario = new ArrayList<Producto>();//NUEVA INSTANCIA DE ARRAY LIST
	
	public MetodoDePago() {//CREO EL CONSTRUCTOR DE LA CLASE METODO DE PAGO
		
	};
	
	public Double calcularPrecioBruto(List<Producto> listaInventario) {//CREO UN METODO EL CUAL CALCULA EL PRECIO BRUTO
		
		Double precioBruto = 0.0;//DECLARO E INICIALIZO LA VARIABLE QUE CONTENDRA EL VALOR A RETORNAR
		
		for(Integer i=0; i<listaInventario.size();i++) {//REALIZO UN BUCLE QUE RECORRE CADA ELEMENTO DE LA LISTA
			
			precioBruto = precioBruto + (listaInventario.get(i).getPrecio() * listaInventario.get(i).getCantidad());
			
		};//EXTRAIGO CON LOS GETTER LOS VALORES DE LA CANTIDAD A COMPRAR Y EL VALOR DEL PRODUCTO, LOS MULTIPLICO ENTRE SI Y LOS CARGO EN LA VARIABLE QUE FUNCION COMO CONTADOR
		
		return precioBruto;//RETORNO LA VARIABLE PARA TRABAJAR CON SU VALOR
	};
	
	public void pagoConEfectivo(List<Producto> listaInventario) {//EL METODO TRABAJARA EL PRECIO BRUTO PARA PAGOS CON EFECTIVO, A MODO DE MUESTRA NO RECIBE ALTERACION POR IVA O OTRO RECARGO
		
		System.out.println("El valor a pagar en efectivo es de:");
		
		System.out.println("");
		
		System.out.println("$" + this.calcularPrecioBruto(listaInventario));//IMPRIMO EN PANTALLA EL VALOR FINAL
		
		
		
	};
	
	public void pagoConDebito(List<Producto> listaInventario) {//EL METODO TRABAJARA EL PRECIO BRUTO PARA PAGOS CON TARJETA DE DEBITO, A MODO DE MUESTRA SE RECARGA EL IVA (21%)
		
		Double recargoIVA = this.calcularPrecioBruto(listaInventario) * 0.21;
		
		Double montoTotalDebito = this.calcularPrecioBruto(listaInventario) + recargoIVA;
		
		System.out.println("Recargo por IVA:");
		
		System.out.println(recargoIVA);// SE MUESTRA CUANTO SE RECARGRIA DE IVA
		
		System.out.println("El valor a pagar con tarjeta de debito es de:");
		
		System.out.println("");
		
		System.out.println("$" + montoTotalDebito);//SE IMPRIME EN PANTALLA EL RESULTADO FINAL CON LOS RECARGOS
	};
	
	public void pagoConCredito(List<Producto> listaInventario) {//EL METODO TRABAJA EL PRECIO BRUTO PARA PAGOS CON TARJETA DE CREDITO
		
		Double montoBruto = this.calcularPrecioBruto(listaInventario);//ASIGNO A LA VARIABLE MONTOBRUTO EL CODIGO PARA OBTENER EL MONTO BRUTO Y RESUMIR CODIGO
		
		Double recargoIVA = montoBruto * 0.21;//RECARGO DEL 21%
		
		Double recargoCredito = ((montoBruto + recargoIVA) * 0.10);//RECARGO DE 10% A LOS 

		Double montoTotal = montoBruto + recargoIVA + recargoCredito;//SE HACEN TODOS LOS RECARGOS Y SE CARGAN A LA VARIABLE ONTOTOTAL
		
		System.out.println("Indique cantidad de cuotas:");
		
		System.out.println("1) 1 cuota sin interes");
		
		System.out.println("2) 3 cuotas sin interes");
		
		System.out.println("3) 6 cuotas sin interes");
		
		Integer opcion = sc.nextInt();//INGRESO POR TECLADO LA ELECCION
		
		switch(opcion) {//SE VERIFICAN LAS OPCIONES
		
		case 1://SI SE ELIJE UNA CUOTA SIN INTERES
			
			System.out.println("Precio final bruto:");
			
			System.out.println(montoBruto);
			
			System.out.println("Recargo por IVA:");
			
			System.out.println(recargoIVA);
			
			System.out.println("Recargo con tarjeta de credito:");
			
			System.out.println(recargoCredito);
			
			System.out.println("Precio final en una cuota sin interes:");
			
			System.out.println("$" + montoTotal);//SE IMPRIME EN PANTALLA EL RESULTADO FINAL CON LOS RECARGOS
			
			break;
			
		case 2://SI SE ELIJEN 3 CUOTAS SIN INTERES
			
			System.out.println("Precio final bruto:");
			
			System.out.println(montoBruto);
			
			System.out.println("Recargo por IVA:");
			
			System.out.println(recargoIVA);
			
			System.out.println("Recargo con tarjeta de credito:");
			
			System.out.println(recargoCredito);
			
			System.out.println("Precio final en 3 cuotas sin interes:");
			
			System.out.println("$" + montoTotal/3);//SE IMPRIME EN PANTALLA EL RESULTADO FINAL CON LOS RECARGOS
			
			break;
			
		case 3://SI SE ELIJEN 6 CUOTAS SIN INTERES
			
			System.out.println("Precio final bruto:");
			
			System.out.println(montoBruto);
			
			System.out.println("Recargo por IVA:");
			
			System.out.println(recargoIVA);
			
			System.out.println("Recargo con tarjeta de credito:");
			
			System.out.println(recargoCredito);
			
			System.out.println("Precio final en 6 cuotas sin interes:");
			
			System.out.println("$" + montoTotal/6);//SE IMPRIME EN PANTALLA EL RESULTADO FINAL CON LOS RECARGOS
			
			break;
			
		};
		
		
		
	};
	
}
