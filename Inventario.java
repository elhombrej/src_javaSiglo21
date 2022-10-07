import java.util.ArrayList;//IMPORTO LA LIBRERIA DE ARRAY LIST
import java.util.List;//IMPORTO LA LIBRERIA DE LIST

public class Inventario {//CREO LA CLASE INVENTARIO DONDE SE IMPRIIRA EL INVENTARIO EN CONSOLA

	public List<Producto> listaInventario = new ArrayList<Producto>();//UNA NUEVA INSTANCIA DE ARRAY LIST
	
	
	public Inventario() {};//CONSTRUCTOR DE LA CLASE INVENTARIO

	public List<Producto> getListaInventario() {//CREO EL GETTER DE LA LISTA
		return listaInventario;
	}

	public void setListaInventario(List<Producto> listaInventario) {//CREO EL SETTER DE LA LISTA
		this.listaInventario = listaInventario;
	}

	public void mostrarInventario() {//CREO EL METODO QUE MOSTRARA EN PANTALLA EL IVENTARIO
		
		System.out.println("**************************");

		System.out.println("");
		
		System.out.println("IMPRIMO EL INVENTARIO: ");
		
		System.out.println("");
		
		System.out.println("**************************");
		
		for(Integer i=0; i<listaInventario.size();i++) {//REALIZO UN BUCLE PARA QUE CADA ELEMENTO DE LA LISTA IMPRIMA SUS PROPIEDADES
			
			System.out.println("Nombre:");
			
			System.out.println("");
		
			System.out.println(listaInventario.get(i).getNombre());//USO EL INDICE PARA ACCEDER A UN ELEMENTO EN PARTICULAR E INVOCO EL GETTER DE EL ELEMENTO REQUERIDO
			
			System.out.println("");
			
			System.out.println("Tipo:");
			
			System.out.println(listaInventario.get(i).getTipo());
			
			System.out.println("");
			
			System.out.println("Precio:");
			
			System.out.println(listaInventario.get(i).getPrecio());
			
			System.out.println("");
			
            System.out.println("Cantidad a comprar:");
			
			System.out.println(listaInventario.get(i).getCantidad());
			
			System.out.println("");
			
			System.out.println("ID:");
			
			System.out.println(listaInventario.get(i).getId());
			
			System.out.println("");
			
			System.out.println("**************************");
			
		}
		
	};

}
