package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	public void turnOn() {
		tv.estado = true;
	}
	
	public void canalUp() {
		if (tv.canal < 120 && tv.estado){
			tv.canal++;
		}
	}
	public void setCanal(int canal){
		this.tv.canal = canal;
	}
	public void volumenUp() {
		if (tv.volumen<7 && tv.estado) {
			tv.volumen++;
		}
		
	}
}
