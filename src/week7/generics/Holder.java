package week7.generics;

public class Holder<E> {

    private E element;

    public Holder(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
