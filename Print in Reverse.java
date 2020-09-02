    static void reversePrint(SinglyLinkedListNode head) {
        SinglyLinkedListNode aux = head;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode ant = null;
        if(aux == null){
            return ;
        }
        while(aux != null){ 
            ant = aux; 
            aux = aux.next;
            ant.next = prev;
            prev = ant;
            head = ant;
        }
        aux = head;
        while(aux != null){ 
            System.out.println(aux.data);
            aux = aux.next;
        }
    }
