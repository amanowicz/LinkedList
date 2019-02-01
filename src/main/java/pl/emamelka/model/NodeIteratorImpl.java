package pl.emamelka.model;

public class NodeIteratorImpl<T> implements NodeIterator<T> {

    private Node<T> currentElement;

    public NodeIteratorImpl(Node<T> head) {
        this.currentElement = head;
    }

    public Node<T> getCurrentElement(){
        return currentElement;
    }

    public boolean hasNext() {
        return currentElement.getNextElement() != null;
    }

    public void next() {
        currentElement = currentElement.getNextElement();
    }

}
