package componentTests;

import components.CarEngine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarEngineTest {

    CarEngine engine;

    @Before
    public void before() {
        engine = new CarEngine("electric", 12, 10.5);
    }

    @Test
    public void canGetProperties() {
        assertEquals("electric", engine.getType());
        assertEquals(12, engine.getVolume());
        assertEquals(10.5, engine.getHorsepower(), 0.01);
    }

}
