static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
       SinglyLinkedListNode nuevo=new SinglyLinkedListNode(data);
       if (llist==null){           
           return nuevo;
       }else{
           nuevo.next=llist;
           llist=nuevo;
           return llist;
       }
    }
