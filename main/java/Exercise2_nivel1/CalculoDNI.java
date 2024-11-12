package Exercise2_nivel1;

public class CalculoDNI {


    public static char calculateDni (int dni){

        int resto =dni%23;

        String possibleletters="TRWAGMYFPDXBNJZSQVHLCKE";

        char letra=possibleletters.charAt(resto);

        return letra;


    }

}
