
public class Producto {
	
	String nombre; // DECLARO EL NOMBRE DEL PRODUCTO
	
	String tipo; // DECLARO EL TIPO DE PRODUCTO
	
	Double precio; //DECLARO EL PRECIO
	
	Integer cantidad; //DECLARO LA CANTIDAD DE PRODUCTO QUE EL CLIENTE DESEA COMPRAR
	
	Integer id;//DECLARO EL ID QUE LLEVARA EL PRODUCT, ESTE SERA LA POSICION EN LA LISTA
	
	public Producto(String nombre, String tipo, Double precio, Integer cantidad, Integer id) {//CREO EL CONSTRUCTOR DE LA CLASE PRODUCTO
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.cantidad = cantidad;
		this.id = id;
	}

	public String getNombre() {//CREO LOS GETTERS DE TODOS LOS ELEMENTOS
		return nombre;
	}

	public void setNombre(String nombre) {//CREO LOS SETTERS DE TODOS LOS ELEMENTOS
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}