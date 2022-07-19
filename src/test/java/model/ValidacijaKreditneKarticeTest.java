package model;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ValidacijaKreditneKarticeTest {

    @Test
    public void invalidanBrojTest() {
        Long invalidniBrojKartice = 4388576018402626L;
        assertFalse(ValidacijaKreditneKartice.validiraj(invalidniBrojKartice));
    }

    @Test
    public void validanBrojTest() {
        Long validanBrojKartice = 4388576018410707L;
        assertTrue(ValidacijaKreditneKartice.validiraj(validanBrojKartice));
    }


    @Test
    public void inProgresTestBrojTest() {
        Long validanBrojKartice = 4388572316018410707L;
        assertTrue(!ValidacijaKreditneKartice.validiraj(validanBrojKartice));
    }
/*
    @Test
    public void inProgresTestBrojTest() {
        Long validanBrojKartice = 4388572316018410707L;
        assertTrue(ValidacijaKreditneKartice.nekaNovaValidacija(validanBrojKartice));
    }
*/
}