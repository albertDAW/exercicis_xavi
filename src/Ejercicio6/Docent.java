package Ejercicio6;

/**
 * Created by Albert on 04/10/2016.
 */
public class Docent extends Persona implements Treballador {
    private String ccc;
    
    public void pagaAlTreballador(Treballador treballador){
        String ccc = treballador.getcCC();
    }
    public String getcCC(){
        return this.ccc;
    }
}
