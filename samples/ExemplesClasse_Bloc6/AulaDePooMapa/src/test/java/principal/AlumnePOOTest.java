package principal;

import org.junit.Assert;
import org.junit.Test;

public class AlumnePOOTest {
    @Test
    public void laClasseNoEmmagatzemaNotesLaboratoriInvalides() {
        // Given: un alumne
        AlumnePOO arnau = new AlumnePOO("arnau", "12345");
        // When: li poso una nota valida
        // When: li poso una nota invalida
        arnau.setLaboratori(17.5);
        // When: li poso una nota invalida
        arnau.setLaboratori(-3.5);
                arnau.setLaboratori(7.5);

        // Then: l'alumne recorda la seva nota
        Assert.assertEquals(
                 7.5,
                 arnau.getLaboratori(),
                 0.1
        );
        
               
    }

     @Test
    public void laClasseNoEmmagatzemaNotesDelParcialInvalides() {
        // Given: un alumne
        AlumnePOO arnau = new AlumnePOO("arnau", "12345");
        // When: li poso una nota valida
        arnau.setExParcial(7.5);
        // When: li poso una nota invalida
        arnau.setExParcial(17.5);
        // When: li poso una nota invalida
        arnau.setExParcial(-3.5);
        // Then: l'alumne recorda la seva nota
        Assert.assertEquals(
                7.5,
                 arnau.getExParcial(),
                 0.1
        );
    }
    

}
