interface Sim
{
	void call();
}


class Airtel extends Sim
{
	public void call(){
		System.out.println("Airtel calling");
	}
}


class BSNL extends Sim
{
	public void call(){
		System.out.println("BSNL calling");
	}
}


class Mobile
{
	public void insertSim(Sim s){
		s.call();
	}
}

class Test01
{

	public static void main(String[] args){
		
		Mobile m = new Mobile();
		m.insertSim(Airtel);
	}
}