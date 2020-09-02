    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode aux;
        aux = head;
        if(aux == null){
            return aux;
        }
        while(aux!=null){ 
            DoublyLinkedListNode anterior;
            anterior = aux.prev;
            aux.prev = aux.next;
            aux.next = anterior;
            head = aux; 
            aux = aux.prev;
        }
        return head;
    }
