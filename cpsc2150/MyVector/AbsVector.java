package cpsc2150.MyVector;

/**
 * <p>
 * An abstract class that contains an overridden implementation of {@link Object#toString()}.
 * </p>
 */
public abstract class AbsVector<T> implements IVector<T> {

    /**
     * <p>
     * This overridden method retrieves the contents of the vector as a string.
     * </p>
     *
     * @return A string representation of the vector. The vector remains the same.
     *
     * @pre None
     *
     * @post toString = [ String representation of the vector ]
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < this.length(); i++) {
            // Make sure we are able to "restore" the IVector when we are done generating a string
            T x = this.removeElement();
            sb.append(x);
            this.addElement(x);

            // Put a comma if it is not the last element.
            if (i < this.length() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");

        return sb.toString();
    }

}