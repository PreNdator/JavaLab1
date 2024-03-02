import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class IntArrayTest {
    private IntArray _intArray;
    private int _value1;
    private int _value2;
    private int _value3;
    private int _value4;

    @BeforeEach
    public void setUp() {
        _intArray = new IntArray();
        _value1 = 1;
        _value2 = 2;
        _value3 = 3;
        _value4 = 5;
    }

    @Test
    public void testAddAndGet() {
        _intArray.add(_value1);
        _intArray.add(_value2);
        _intArray.add(_value3);

        assertEquals(_value1, _intArray.get(0));
        assertEquals(_value2, _intArray.get(1));
        assertEquals(_value3, _intArray.get(2));
    }

    @Test
    public void testGetOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> _intArray.get(0));
    }

    @Test
    public void testGetSize() {
        assertEquals(0, _intArray.getSize());

        _intArray.add(_value1);
        _intArray.add(_value2);

        assertEquals(2, _intArray.getSize());
    }

    @Test
    public void testAddAndRemove() {
        _intArray.add(_value1);
        _intArray.add(_value2);
        _intArray.add(_value3);
        _intArray.add(_value4);

        _intArray.remove(2);
        _intArray.remove(1);

        assertEquals(_value1, _intArray.get(0));
        assertEquals(_value4, _intArray.get(1));
        assertEquals(2, _intArray.getSize());
    }

    @Test
    public void testRemoveOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> _intArray.remove(0));
    }
}