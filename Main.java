import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static Map<String,CuerpoCeleste> sistemaSolar=new HashMap<>();
    static Set<CuerpoCeleste> planetas=new HashSet<>();
    public static void main(String[] args) {
        CuerpoCeleste Mercurio=new Planeta("Mercurio",88);
        sistemaSolar.put("Mercurio",Mercurio);
        planetas.add(Mercurio);

        CuerpoCeleste Venus = new Planeta("Venus", 225);
        sistemaSolar.put("Venus", Venus);
        planetas.add(Venus);

        CuerpoCeleste Tierra = new Planeta("Tierra", 365);
        sistemaSolar.put("Tierra", Tierra);
        planetas.add(Tierra);

        CuerpoCeleste Marte = new Planeta("Marte", 687);
        sistemaSolar.put("Marte", Marte);
        planetas.add(Marte);

        CuerpoCeleste Jupiter = new Planeta("Jupiter", 4332);
        sistemaSolar.put("Jupiter", Jupiter);
        planetas.add(Jupiter);

        CuerpoCeleste Saturno = new Planeta("Saturno", 10759);
        sistemaSolar.put("Saturno", Saturno);
        planetas.add(Saturno);

        CuerpoCeleste Urano = new Planeta("Urano", 30660);
        sistemaSolar.put("Urano", Urano);
        planetas.add(Urano);

        CuerpoCeleste Neptuno = new Planeta("Neptuno", 165);
        sistemaSolar.put("Neptuno", Neptuno);
        planetas.add(Neptuno);

        CuerpoCeleste Pluton = new Planeta("Pluton", 248);
        sistemaSolar.put("Pluton", Pluton);
        planetas.add(Pluton);


        CuerpoCeleste Luna = new Luna("Luna", 27);
        CuerpoCeleste Deimos = new Luna("Deimos", 1.3);
        CuerpoCeleste Phobos = new Luna("Phobos", 0.3);
        CuerpoCeleste Io = new Luna("Io", 1.8);
        CuerpoCeleste Europa = new Luna("Europa", 3.5);
        CuerpoCeleste Ganymede = new Luna("Ganymede", 7.1);
        CuerpoCeleste Callisto = new Luna("Callisto", 16.7);

        sistemaSolar.put("Luna", Luna);
        sistemaSolar.put("Deimos", Deimos);
        sistemaSolar.put("Phobos", Phobos);
        sistemaSolar.put("Io", Io);
        sistemaSolar.put("Europa", Europa);
        sistemaSolar.put("Ganymede", Ganymede);
        sistemaSolar.put("Callisto", Callisto);

        Tierra.addSatelite(Luna);
        Marte.addSatelite(Deimos);
        Marte.addSatelite(Phobos);
        Jupiter.addSatelite(Io);
        Jupiter.addSatelite(Europa);
        Jupiter.addSatelite(Ganymede);
        Jupiter.addSatelite(Callisto);

        for (CuerpoCeleste planeta : planetas) {
            System.out.println(planeta.getNombre());
        }
        System.out.println("-----------------------------------");
        for (CuerpoCeleste marte:Marte.getSatelites()){
            System.out.println(marte);
        }
        System.out.println("-----------------------------------");
        Set<CuerpoCeleste> todaslasLunas=new HashSet<>();
        for (CuerpoCeleste todas:planetas){
            todaslasLunas.addAll(todas.getSatelites());
        }
        System.out.println(todaslasLunas);
    }
}