public class IntArray {
    private int[] _array;
    private int _size;

    public IntArray() {
        _array = new int[10];
        _size = 0;
    }

    public IntArray(int initialSize) {
        if (initialSize <= 0) {
            throw new IllegalArgumentException("Initial size must be greater than zero");
        }
        _array = new int[initialSize];
        _size = 0;
    }

    public int getSize() {
        return _size;
    }

    public void add(int element) {
        if (_size == _array.length) {
            int[] newArray = new int[_array.length * 2];
            System.arraycopy(_array, 0, newArray, 0, _array.length);
            _array = newArray;
        }
        _array[_size] = element;
        _size++;
    }

    public int get(int index) {
        if (index < 0 || index >= _size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return _array[index];
    }

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
