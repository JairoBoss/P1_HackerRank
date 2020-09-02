    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode aux;
        aux = head;
        int iter;
        while(head != null){
            head = head.next;
            if(iter<=positionFromTail){ 
                iter++;
            }else{
                aux = aux.next;      
            }
        }
        return aux.data;        
    }