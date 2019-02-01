package pl.emamelka;

import pl.emamelka.model.Node;
import pl.emamelka.model.NodeIterator;
import pl.emamelka.model.NodeIteratorImpl;
import pl.emamelka.utils.LinkedListUtils;

public class Main {
    public static void main(String[] args){

        Node<String> head = new Node<>("head");

        LinkedListUtils.createLinkedList(head);

        NodeIterator<String> nodeIterator = new NodeIteratorImpl<>(head);

        while (true){
            System.out.println(nodeIterator.getCurrentElement().getValue());
            if (!nodeIterator.hasNext()){
                break;
            }
            nodeIterator.next();
        }

        NodeIterator<String> newNodeIterator = new NodeIteratorImpl<>(head);

        while (newNodeIterator.getCurrentElement() != null){
            System.out.println(newNodeIterator.getCurrentElement().getValue());
            newNodeIterator.next();
        }


    }

}
