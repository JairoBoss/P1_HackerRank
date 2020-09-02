    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode nuevo= new DoublyLinkedListNode(data); 
        nuevo.next = null; 
        nuevo.prev = null;
        DoublyLinkedListNode ant;
        ant = null;
        DoublyLinkedListNode aux;
        aux = head;

        while(aux != null){
            if(aux.data >= data ) {
              break;
            }
            ant = aux;
            aux = aux.next;
        }
        if(ant == null){
            nuevo.next = head;
            head.prev = nuevo;
            head = nuevo;
            return head;
        }
        //Hacemos las ligaduras
        ant.next = nuevo; 
        nuevo.prev = ant; 
        nuevo.next = aux; 

        if(aux != null ){
          aux.prev = nuevo;
        }
        return head;
    }
