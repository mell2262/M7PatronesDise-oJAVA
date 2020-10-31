
public class Video {

	// - Video: está formado por una URL, un título y una lista de tags *.
	// * Un tag es un texto con una palabra, tener en cuenta que un video puede
	// tener varios tags.

	private String url;
	private String title;
	private String[] tag;

	public Video(String url, String title, String... tag) throws Exception {
		if (url.equals("")) {
			throw new Exception("el campu url no puede estar vacio");
		} else {
			if (title.equals("")) {
				throw new Exception("el campo titulo no puede estar vacio");
			}
		}

		this.url = url;
		this.title = title;
		for (int i = 0; i < tag.length; i++) {
			if (tag[i].equals(""))
				throw new Exception("no debe ingregar tag´s vacios");
			this.tag = tag;
		}
	}

	public String getUrl() {
		return url;
	}

	public String getTitle() {
		return title;
	}

	public String getTags() {
		String tags = "";
		for (int i = 0; i < tag.length; i++) {
			if (tags == "") {
				tags = tag[i];
			} else {
				tags += ", " + tag[i];
			}
		}
		return tags;
	}

	@Override
	public String toString() {
		return "titulo " + this.getTitle() + " url " + this.getUrl() + " tags " + this.getTags();
	}

}
