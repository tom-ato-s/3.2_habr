//https://habr.com/ru/post/440436/
//        Практические задачи по Java


//3.2. Бинарное дерево поиска
//
//        Реализация бинарного дерева поиска — отличная задача. Я обычно даю её, когда заходит разговор про рекурсию.

package BynaryTree;

public class Tree {
private Node rootNode;
    Tree() {
        rootNode = null;
    }


   public Node findeNodeByValue(int value) {  //поиск узла по значению
       Node currentNode = rootNode;   //начинаем поиск с корневого узла
       while (currentNode.getValue() != value) {
           if (value < currentNode.getValue()) {
               currentNode = currentNode.getLeftChild();
           } else {
               currentNode = currentNode.getRightChild();
           }
           if (currentNode == null)
               return null;
       }
       return currentNode;
   }

   public void insertNode(int value) { // метод вставки нового элемента
        Node newNode = new Node();
        newNode.setValue(value);
        if(rootNode == null){
            rootNode = newNode;
        }
        else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if(value == currentNode.getValue()){
                    return;
                }else {
                    if(value<currentNode.getValue()) {
                        currentNode = currentNode.getLeftChild();
                        if(currentNode == null) {
                            parentNode.setLeftChild(newNode);
                            return;
                        }
                    }else parentNode = currentNode.getRightChild();
                    if(currentNode == null) {
                        parentNode.setRightChildr(newNode);
                        return;
                    }
                }
            }

        }
   }




}
