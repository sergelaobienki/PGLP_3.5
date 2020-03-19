package PGLP_3.Pglp3_5;

import java.time.LocalDateTime;

public class Affichage implements Affiche{

	public  void Affich(String text) {
		
		System.out.println(LocalDateTime.now() +""+text);
	}



}
