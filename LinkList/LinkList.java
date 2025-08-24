class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Ll{
    Node head = null;
    public void insertNode(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            Node it = head;
            while(it.next!=null){
                it = it.next;
            }
            it.next = node;
        }
    }
    
    public void removeNode(int delData){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node prev = head;
            Node curr = head.next;
            if(prev.data == delData ){
                head = head.next;
            }
            while(curr !=null){
                if(curr.data == delData){
                    prev.next = curr.next;
                    System.out.println("Data Removed");
                    break;
                }
                prev = prev.next;
                curr = curr.next;
            }
        }
        
    }
    
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node it = head;
            while(it !=null){
                System.out.println(it.data);
                it = it.next;
            }
        }
    }
}
class LinkList{
  public static void main(String [] args){
       Ll ll1 = new Ll();
   ll1.insertNode(5);
   ll1.insertNode(6);
   ll1.insertNode(7);
   ll1.insertNode(8);
  
   ll1.removeNode(5);
    ll1.removeNode(7);
   ll1.printList();
  }
}
