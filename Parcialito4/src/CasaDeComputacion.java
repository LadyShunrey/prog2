import java.util.ArrayList;

public class CasaDeComputacion {
	
	private String nombre;
	private ArrayList<Producto> productos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Proveedor> proveedores;
	private ArrayList<Empleado> empleados;
	
	public CasaDeComputacion(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.proveedores = new ArrayList<>();
		this.empleados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addProducto(Producto p) {
		productos.add(p);
	}

	public void addCliente(Cliente c) {
		clientes.add(c);
	}

	public void addProveedor(Proveedor p) {
		proveedores.add(p);
	}

	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	public ArrayList<Producto> buscarPorFiltro(Filtro filtro){
		ArrayList<Producto> productosPorFiltro = new ArrayList<>();
		for(Producto p: productos){
			if(filtro.cumpleCondicion(p)){
				productosPorFiltro.add(p);
			}
		}
		return productosPorFiltro;
	}
	
	
	
	
	/* SOLUCION ANTERIOR NO ORIENTADA A OBJETOS
	public ArrayList<Producto> buscarPorComponente(String componente){
		ArrayList<Producto> productosPorFiltro = new ArrayList<>();
		for(Producto p: productos){
			if(p.tieneComponente(componente)){
				productosPorFiltro.add(p);
			}
		}
		return productosPorFiltro;
	}
	
	public ArrayList<Producto> buscarProducto(Producto productoBuscado){
		ArrayList<Producto> productosPorFiltro = new ArrayList<>();
		for(Producto p: productos){
			if(p.getNombre()!=null &&  p.getNombre().equals(productoBuscado.getNombre())){
				productosPorFiltro.add(p);
			}
		}
		return productosPorFiltro;
	}
	
	
	public ArrayList<Producto> buscarPorPrecio(double precioMenor){
		ArrayList<Producto> productosPorFiltro = new ArrayList<>();
		for(Producto p: productos){
			if(p.getPrecio() < precioMenor){
				productosPorFiltro.add(p);
			}
		}
		return productosPorFiltro;
	}
	*/
}
