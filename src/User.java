import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class User {

	//// - Usuario: está formado por un nombre, apellido, password y una fecha de
	//// registro.

	private String name;
	private String password;
	private Date dateInicial;

	private List<Video> videos = new ArrayList<Video>();

	public User(String name, String password) throws Exception {
		if (name.equals("")) {
			throw new Exception("el campu nombre no puede estar vacio");
		} else {
			if (password.equals("")) {
				throw new Exception("el campo contraseña no puede estar vacio");
			}
		}
		this.name = name;
		this.password = password;
		this.dateInicial = Calendar.getInstance().getTime();
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public Date getDate() {
		return dateInicial;
	}

	public void addVideo(Video video) {
		videos.add(video);
	}

	public String getVideos() {
		String listVideo = "";
		for (Video e : videos) {
			listVideo += e.toString() + "\n";
		}
		return listVideo;
	}

}
