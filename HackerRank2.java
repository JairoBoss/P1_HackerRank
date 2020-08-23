    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode aux = head;
        SinglyLinkedListNode nuevo=new SinglyLinkedListNode(data);
        if(aux == null){
            return nuevo;
        }
        else{
            aux.next = insertNodeAtTail(aux.next, data);
        }                        
        return aux;
    }
