package pro;

public class Url {
	final String url;
	String encodedUrl;

	public Url(String url) {
		this.url = url;
	}

	public void setEncodedUrl(String encodedUrl) {
		this.encodedUrl = encodedUrl;
	}

	public String getUrl() {
		return url;
	}

	public String getEncodedUrl() {
		return encodedUrl;
	}
}
