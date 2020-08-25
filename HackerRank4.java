SinglyLinkedListNode nuevo = new SinglyLinkedListNode(data);
        SinglyLinkedListNode aux;
        SinglyLinkedListNode ant;
        aux = head; //Va hacer el principal
        ant = null; //Va a ir siguiendo al auxiliar
        
        int nums = 0;
        if(head == null){ // checamos que la lista no esté vacía
            head = nuevo;
            return head;
        }
        else{
            for(int i=0; i < nums; i++){
                head.next = nuevo;
            }
            //Aqui ciclamos hsata llegar al nodo que queremos remplazar
            //Como lo hicimos en clase va a existir un nodo que va a seguir a auxiliar
            for(int i = 0; i < position; i++){ 
                ant = aux; 
                aux = aux.next; 
            }
            //Hacemos los enlazes con los nodoso
            ant.next = nuevo; 
            nuevo.next = aux; 

        }

        return head;