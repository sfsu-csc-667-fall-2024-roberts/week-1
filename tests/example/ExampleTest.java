package tests.example;

import example.Example;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ExampleTest {
    
    @Test
    public void testAdd() {
        Example example = new Example(2, 3);

        assertEquals(6, example.add());
    }
}
