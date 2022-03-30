package taller3.televisores;

public class Control {
	TV tv;

	public void enlazar(TV tv) {
		this.setTV(tv);
		tv.setControl(tv.control);
	}
	public void turnOff() {
		tv.estado = false;
	}
	public void turnOn() {
		tv.estado = true;
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void setCanal(int canal){
		tv.setCanal(canal);
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public TV getTv() {
		return tv;
	}
	public void setTV(TV tv){
		this.tv = tv;
	}
}
