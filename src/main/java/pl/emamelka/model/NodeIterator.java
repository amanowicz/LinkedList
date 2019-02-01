package pl.emamelka.model;

public interface NodeIterator<T> {

    Node<T> getCurrentElement();
    boolean hasNext();
    void next();
}
