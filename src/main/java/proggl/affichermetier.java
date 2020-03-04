package proggl;

import java.time.LocalDateTime;

public class affichermetier {

    public affichermetier(){}

    public void affichedebut(){

        System.out.println(LocalDateTime.now() + "DebutdeUnemethodemetier");

    }

    public void affichefin(){

        System.out.println(LocalDateTime.now() + "FindeUnemethodemetier");

    }
}
