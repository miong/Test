public class TransportFactory {


	public Strategy build(Context c) throws Exception{
		switch(c){
		case ALONE: return new ByCar();
		case FASTEST: return new ByCab();
		case CHEAPEST: return new ByBus();
		default: throw new Exception("Unknown Context");
		}
	}
	
}
