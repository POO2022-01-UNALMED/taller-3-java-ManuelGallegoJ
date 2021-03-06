package taller3.televisores;

public class Control {
	private TV tv;

	public void enlazar(TV tv) {
		this.setTV(tv);
		tv.setControl(this);
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void turnOn() {
		tv.turnOn();
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
