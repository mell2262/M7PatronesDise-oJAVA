import java.util.Scanner;

public class Main {

	// Crea un programa en Java con la estructura de dominio de las clases
	// Un usuario puede crear nuevos vídeos y ver un listado de sus videos. Puedes
	// hacer uso de la clase Scanner o
	// JoptionPane para interactuar con el usuario.
	// La estructura no debe permitir añadir campos vacíos, en caso de que haya debe
	// devolver una excepción. Hs
	// de hacer uso de java Exceptions.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		User usuario1 = null;
		do {
			System.out.println("ingrese usuario, contraseña");
			String name = scan.next();
			String pass = scan.next();

			try {
				usuario1 = new User(name, pass);
			} catch (Exception e) {
				e.getMessage();
			}
		} while (usuario1 == null);

		String n;
		do {
			System.out.println("1:crear nuevo video\n2: ver lista de videos\n3: Salir");
			n = scan.next();

			switch (n) {
			case "1":
				System.out.println("introduzca url, titulo y cuantos tags y los tags del video");
				String url = scan.next();
				String title = scan.next();
				int tags = scan.nextInt();
				String[] tag = new String[tags];
				for (int i = 0; i < tags; i++)
					tag[i] = scan.next();
				try {
					Video video = new Video(url, title, tag);
					usuario1.addVideo(video);
				} catch (Exception e) {
					e.getMessage();
				}
				break;
			case "2":
				System.out.println(usuario1.getVideos());
				break;
			default:
				break;
			}

		} while (!n.equals("3"));
		scan.close();

	}

}
