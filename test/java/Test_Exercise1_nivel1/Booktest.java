package Test_Exercise1_nivel1;

import Exercise1_Nivel1.Book;
import Exercise1_Nivel1.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class Booktest {

   private Library library;


   @BeforeEach

   public void setUp(){

      library=new Library();


   }



   @Test

    public void testListaLibrosNoEsNulaDespuesDeInicializacion(){


       assertNotNull(library.get_thewhole_list(),"La lista deberia estar iniciada y no nula");


   }


   @Test

   public void testTamañoListaDespuesDeAgregarLibros(){

      library.add_book("Cien años de soledad");

      library.add_book("Ready player one");

      library.add_book("Inferno");

      int expectedsize=3;

      assertEquals(expectedsize, library.get_thewhole_list().size());
   }

 @Test

   public  void  testObtenerLibroEnPosicionValida(){

      library.add_book("Sherlock holmes");

      library.add_book("Algebra de baldor");

      assertEquals("Algebra de baldor",library.get_specific_title(1));


 }

 @Test

   public void testNoHayTitulosDuplicadosEnLaLista(){

    library.add_book("Cien años de soledad");

    library.add_book("Ready player one");

    library.add_book("Inferno");

    library.add_book("Cien años de soledad");

    List<Book> books =library.get_thewhole_list();

    Set<Book> booksnodupliactes=new HashSet<>(books);

    assertEquals(books.size(),booksnodupliactes.size());


 }

   @Test

   public void testObtenerTituloDeLibroEnPosicionEspecifica(){

      library.add_book("Cien años de soledad");

      library.add_book("Ready player one");

      library.add_book("Inferno");

      library.add_book("Cien años de soledad");

      int position = 1;

      String esperado = "Ready player one";

      assertEquals(esperado,library.get_specific_title(position));



   }

   @Test
    public void testAgregarLibroModificaLaListaCorrectamente(){

      int formersize=library.get_thewhole_list().size();

      String newbook="El señor de los anillos";

      library.add_book(newbook);

      assertEquals(formersize + 1,library.get_thewhole_list().size());

   }

@Test

public void testEliminarLibroDisminuyeElTamañoDeLaLista (){

   library.add_book("Cien años de soledad");

   library.add_book("Ready player one");

   library.add_book("Inferno");

   int formersize=library.get_thewhole_list().size();

   library.remove_specific_position(2);

   assertEquals(formersize -1,library.get_thewhole_list().size());


}


    @Test
    public void testListaPermaneceOrdenadaAlfabeticamenteDespuesDeAgregar(){

        library.add_book("Cien años de soledad");

        library.add_book("Ready player one");

        library.add_book("Inferno");

        List<Book> listwithoutorder = library.get_thewhole_list();

        List <Book> listordered = new ArrayList<>(listwithoutorder);

        Collections.sort(listordered);

        assertEquals(listordered,listwithoutorder);


    }

    @Test
    public void testListaPermaneceOrdenadaAlfabeticamenteDespuesDeEliminar(){

        library.add_book("Cien años de soledad");

        library.add_book("Ready player one");

        library.add_book("Inferno");

        library.remove_specific_position(1);


        List<Book> listwithoutorder = library.get_thewhole_list();

        List <Book> listordered = new ArrayList<>(listwithoutorder);

        Collections.sort(listordered);

        assertEquals(listordered,listwithoutorder);

    }


}
