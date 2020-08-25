    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        SinglyLinkedListNode aux; //El que va primero
        SinglyLinkedListNode ant; //Nodo que va a seguir al aux
        aux = head; 
        ant = null;   
        //Lista vacia 
        if(aux==null){
            return aux;
        }
        if (position==0) {
            //En el caso de que se quiera eliminar el nodo 0
            //tenemos que brincarnos al siguiente nodo, lo que este apuntando aux en next
            aux=aux.next;
            head=aux;
            return aux;        
        }   

        //Ciclamos hasta llegar al nodo que queremos borrar
        for(int i =0; i<position;i++){ 
        ant = aux; 
        aux=aux.next; 
        }
        //Cuando lleguemos al nodo que queremos eliminar 
        //Tenemos que hacer los enlazes
        ant.next = aux.next;         
        //Aqui desaparecemos al nodo
        aux.next = null; 


        return head;

    }
