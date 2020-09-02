       static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2){
        SinglyLinkedListNode aux0;
        SinglyLinkedListNode aux1;
        aux0 = head1;
        aux1= head2;
        int data1;
        int data2;
        if (head1 == null && head2 == null){
            return true;
        }
        while(aux0!=null&&aux1!=null){ 
            if(aux0.data != aux1.data){
                return false;
            }
            if(aux0.next == null && aux1.next == null){

                return true; 
            }
            aux0 = aux0.next;
            aux1 = aux1.next;
        }
        return false;
    }
