
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode aux;
        aux=head;        
        
        while(aux.next != null){ 

            if(aux.data==aux.next.data){nodo en el que está es diferente de null.
                aux.next=aux.next.next;
            }else{
                aux = aux.next;
            }

        }
        return head;

    }