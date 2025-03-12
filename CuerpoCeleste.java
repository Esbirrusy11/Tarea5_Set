
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    enum TipoCuerpoCeleste{ESTRELLA,PLANETA,PLANETA_ENANO,LUNA,COMETA,ASTEROIDE};
    private String nombre;
    private double periodoOrbital;
    private TipoCuerpoCeleste tipoCuerpo;
    private Set<CuerpoCeleste> satelites;


    public CuerpoCeleste(String nombre, double periodoOrbital,TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.satelites = new HashSet<>();
        this.tipoCuerpo = tipoCuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public Set<CuerpoCeleste> getSatelites() {
        HashSet<CuerpoCeleste> has=new HashSet<>(satelites);
        return has;
    }

    public boolean addSatelite (CuerpoCeleste con){
        if (!satelites.contains(con)){
            satelites.add(con);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Double.compare(periodoOrbital, that.periodoOrbital) == 0 && Objects.equals(nombre, that.nombre) && Objects.equals(satelites, that.satelites) && tipoCuerpo == that.tipoCuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, periodoOrbital, satelites, tipoCuerpo);
    }

    @Override
    public String toString() {
        return
                "Nombre-> " + nombre  +
                        " PeriodoOrbital-> " + periodoOrbital +
                        " TipoCuerpo-> " + tipoCuerpo ;

    }
}

