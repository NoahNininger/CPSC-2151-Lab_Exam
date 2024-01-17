package cpsc2150.MyVector;

import java.util.ArrayList;
import java.util.List;

public class ArrayVector<T> extends AbsVector<T> implements IVector<T> {
// ===========================================================
    // Member Fields
    // ===========================================================

    /**
     * <p>
     * this time store the vector in a list. myVector.get(0) is the front of the vector
     * </p>
     */
    private final ArrayList<T> myVector;

    // ===========================================================
    // Constructors
    // ===========================================================

    /**
     * <p>
     * This creates a new list-based vector that is initially empty.
     * </p>
     *
     * @pre None
     *
     * @post myVector = [a value list of MAX_LENGTH]
     */
    public ArrayVector() {
        myVector = new ArrayList<>();
    }

    // ===========================================================
    // Public Methods
    // ===========================================================

    @Override
    public void addElement(T val) {
        myVector.add(val);
    }

    @Override
    public T removeElement() {
        T val = myVector.get(0);
        myVector.remove(0);
        return val;
    }

    @Override
    public boolean contains(T val) {
        return myVector.contains(val);
    }

    @Override
    public T get(int pos) {
        return myVector.get(pos - 1);
    }

    @Override
    public int length() {
        return myVector.size();
    }

    @Override
    public void clear() {
        myVector.clear();
    }


    // helper function for replace()
    /**
     * Adds x to the front of the deque
     *
     * @param x Integer to be added to front of queue
     * @pre myQ.size() < IDeque.MAX_LENGTH
     * @post Last element in queue = x
     */
    @Override
    public void inject(T x)
    { myVector.add(0, x); }
}
