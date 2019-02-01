package pl.emamelka.utils;

import pl.emamelka.model.Node;

public class LinkedListUtils {

    public static void createLinkedList(Node<String> head){
        Node<String> secondElement = new Node<String>("second");
        Node<String> thirdElement = new Node<String>("third");
        Node<String> forthElement = new Node<String>("forth");
        Node<String> fifthElement = new Node<String>("fifth");

        head.setNextElement(secondElement);
        secondElement.setNextElement(thirdElement);
        thirdElement.setNextElement(forthElement);
        forthElement.setNextElement(fifthElement);

    }
}
