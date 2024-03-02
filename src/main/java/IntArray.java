/**
 * Class for storing integers in an array.
 */
public class IntArray {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] _array;
    private int _size;

    /**
     * Constructor without parameters, creating an array with an initial capacity of {@link IntArray#DEFAULT_CAPACITY}.
     */
    public IntArray() {
        this._array = new int[DEFAULT_CAPACITY];
        this._size = 0;
    }

    /**
     * Constructor specifying the initial capacity of the array.
     *
     * @param initialSize The initial capacity of the array
     * @throws IllegalArgumentException If the specified size is less than or equal to zero
     */
    public IntArray(int initialSize) {
        if (initialSize <= 0) {
            throw new IllegalArgumentException("Initial size must be greater than zero");
        }
        this._array = new int[initialSize];
        this._size = 0;
    }

    /**
     * Method to get the current size of the array.
     *
     * @return The current size of the array
     */
    public int getSize() {
        return _size;
    }

    /**
     * Method to add an element to the array.
     *
     * @param element The element to be added
     */
    public void add(int element) {
        if (_size == _array.length) {
            int[] newArray = new int[_array.length * 2];
            System.arraycopy(_array, 0, newArray, 0, _array.length);
            _array = newArray;
        }
        _array[_size] = element;
        _size++;
    }

    /**
     * Method to get an element from the array by index.
     *
     * @param index The index of the element
     * @return The element from the array at the specified index
     * @throws IndexOutOfBoundsException If the index is out of bounds of the array
     */
    public int get(int index) {
        if (index < 0 || index >= _size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return _array[index];
    }

    /**
     * Method to remove an element from the array by index.
     *
     * @param index The index of the element to be removed
     * @throws IndexOutOfBoundsException If the index is out of bounds of the array
     */
    public void remove(int index) {
        if (index < 0 || index >= _size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        for (int i = index; i < _size - 1; i++) {
            _array[i] = _array[i + 1];
        }
        _size--;
    }
}