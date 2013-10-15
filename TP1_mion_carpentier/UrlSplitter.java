
public class UrlSplitter {

	private String protocol;
	private String domain;
	private String path;
	private String port;
	
	public String getProtocol() {
		return protocol;
	}
	public String getDomain() {
		return domain;
	}
	public String getPath() {
		return path;
	}
	public String getPort() {
		return port;
	}
	
	public boolean split(String url){
		
		String tmp = url;
		int ind = -1;
		boolean hasPort;
		ind = tmp.contains("://") ? tmp.indexOf("://") : 0;
		protocol = tmp.substring(0,ind);
		tmp = tmp.substring(ind+3);
		
		hasPort = tmp.contains(":"); 
		ind =  hasPort ? tmp.indexOf(":")-1 : tmp.indexOf("/");
		if(ind<0)
			ind = tmp.length()-1;
		domain = tmp.substring(0,ind+1);
		tmp = tmp.substring(ind+1);
		
		if(hasPort){
			ind = tmp.contains("/") ? tmp.indexOf("/")-1 : tmp.length()-1;
			port = tmp.substring(0,ind+1);
			tmp = tmp.substring(ind+1);
		}
		
		ind = tmp.contains("?") ? tmp.indexOf("?")-1 : tmp.length()-1;
		path = tmp.substring(0,ind+1);
		tmp = tmp.substring(ind+1);
		
		System.out.println(url);
		System.out.println(domain);
		System.out.println(path);
		return true;
	}
	
}
