public class LinkedList {

    Node head;
    private int numNodes;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }



    public LinkedList(Object dat) {
         head = new Node(dat);

    }

    public void addAtHead(Object dat){

        Node temp = head;
        head = new Node(dat);
        head.next = temp;

        numNodes++;

    }

    public Node findNode(Object dat){
        Node temp = head;

        while(temp != null){
           if(temp.getData() == dat)
               return temp;
           head = head.next;
        }
        return null;

    }
    public boolean removeFromList(Object dat){
        Node temp = head;
        Node holder = null;
        while(temp.getData() != null){
            if (temp.getData() == dat){
                if (holder != null)
                    holder.setNext(temp.getNext());
                else
                    head = null;
                this.setNumNodes(this.getNumNodes()-1);
                return true;

            }
            holder = temp;
            temp = temp.getNext();

        }
    return false;
    }


    class Node {



        private Node next;
        private Object data;

        public void setNext(Node next) {
            this.next = next;
        }


        public Node getNext() {
            return next;
        }
        private Node(Object dat){

            data = dat;
        }

        public Object getData() {
            return data;
        }

    }
}

