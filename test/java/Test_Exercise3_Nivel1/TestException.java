package Test_Exercise3_Nivel1;

import Exercise3_Nivel1.Outofindex;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestException {

    @Test

    void IndexOutOfBoundsExceptionTest (){



        assertThrows(IndexOutOfBoundsException.class, Outofindex::giveException);

        

    }



}
