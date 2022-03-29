package taller3.televisores;

public class TV{
	private Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	private Control control;
	int numTV = 0;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if (volumen<8 && estado && volumen >= 0) {
			this.volumen = volumen;
		}
		
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio){
		this.precio= precio;
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal){
		if (canal<121 && estado && canal>0) {
			this.canal = canal;
		}
		
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void turnOff() {
		estado = false;
	}
	public void turnOn() {
		estado = true;
	}
	
	public void canalUp() {
		if (canal < 120 && estado){
			canal++;
		}
		
	}
	public void canalDown() {
		if (canal>1 && estado) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if (volumen<7 && estado) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (volumen>1 && estado) {
			volumen--;	
		}
		
	}
}





























