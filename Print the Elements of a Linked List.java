    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode aux = head;
        while(aux!=null){
            System.out.println(aux.data);
            aux=aux.next;
        }



    }
