package app2;

public class Server extends Computer{
	public int kolProc;

	public int getKolProc() {
		return kolProc;
	}

	public void setKolProc(int kolProc) {
		this.kolProc = kolProc;
		count+=kolProc; //считаем количество процессоров
	}
	

}
