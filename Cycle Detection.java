    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode ant= head; 
        SinglyLinkedListNode aux= head.next;

        if(head == null) return false;

        while(aux!=null&&aux.next != null){
            if(aux == ant){ 
                return true;
            }
            ant = ant.next;
            aux = aux.next.next;

        }
        return false; 
    }