package videojuegoEjecutable;

import java.util.ArrayList;
import java.util.List;

import com.curso.clases.VideoJuego;

public class VideojuegoEjecutable {

	public static void main(String[] args) {
		
		
		List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
		
		VideoJuego video1 = new VideoJuego(123, "Super Mario 64", "Nintendo64", 1, "Plataforma");
		VideoJuego video2 = new VideoJuego(456, "Pokemon Stadium", "Nintendo64", 2, "Batalla");
		VideoJuego video3 = new VideoJuego(789, "Doom", "PC", 1, "Shooter");
		VideoJuego video4 = new VideoJuego(321, "Super Mario 64", "Nintendo64", 1, "Plataforma");
		VideoJuego video5 = new VideoJuego(654, "Street fighter", "Super Nintendo", 2, "Batalla");
		
		listaVideoJuegos.add(video1);
		listaVideoJuegos.add(video2);
		listaVideoJuegos.add(video3);
		listaVideoJuegos.add(video4);
		listaVideoJuegos.add(video5);
		
		for(VideoJuego video : listaVideoJuegos ) {
			System.out.println("Título: " + video.getTitulo() + " Consola: " + video.getConsola() + " Cantidad de jugadores "
					+ video.getCanJugadores());
		}
		
		
		//Cambio de nombre y de número de jugadores
		video3.setTitulo("Doom revenge");
		video3.setCanJugadores(2);
		video5.setTitulo("Street fighter turbo");
		video5.setCanJugadores(4);
		
		
		System.out.println("---------------NINTENDO 64----------------");
		
		for(VideoJuego videoJuego : listaVideoJuegos ) {
			
			if(videoJuego.getConsola().equals("Nintendo64")) {
	
			System.out.println(videoJuego.toString());	
			}
		}
		
		
		
		
		
		
		
	}

}
