    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode aux;
        SinglyLinkedListNode ant;
        ant = null;
        aux= head;

        if(aux == null){
            return aux;
        }
        while(aux != null){ 
            aux = head.next; 
            head.next = ant; 
            ant=head; 
            head = aux;

        }
        head = ant; 

        return head;
    }
