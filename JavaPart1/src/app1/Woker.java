package app1;

class Woker {
	int detals;
	String work;
	Woker(String work, int detals){
		this.detals = detals;
		this.work = work;}
	
	public int getDetals() {
		return detals;
	}
	public void setDetals(int detals) {
		this.detals = detals;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	static int agregat(int detUstr, Woker rab)	{
		int agrDet=0;
		agrDet = rab.getDetals() + detUstr;
	return agrDet;
}
	static Woker novy = new Woker("Новенький", 1);
	static Woker spec = new Woker("Специалист", 3);
	static Woker master = new Woker("Мастер", 5);
}
