package Exercise3_Nivel1;

import java.util.ArrayList;

public class Outofindex {

    public static void giveException(){

        ArrayList<Float> index=new ArrayList<>();


        index.add(9.5f);
        index.add(3.5f);
        index.add(0.2f);

        index.get(5);


    }
}
