
public class Client {

	private Context c;
	private Strategy strat;
	private TransportFactory fac;
	public Client(Context c){
		this.c = c;
		fac = new TransportFactory();
	}

	public Context getC() {
		return c;
	}

	public void setC(Context c) {
		this.c = c;
	}
	
	public String goToTheAirport(){
		try {
			strat = fac.build(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strat.goToAirport();
	}

}
