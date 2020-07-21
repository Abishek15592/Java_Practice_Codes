class Node1
{
    int data;
    Node1 left, right;

    Node1(int item)
    {
        data = item;
        left = right = null;
    }
}
class Left_View_of_BST
{
    void leftView(Node1 root)
    {
      while(root!=null){
          System.out.print(root.data+" ");
          if(root.left!=null){
              root = root.left;
          }
          
          else{
              root = root.right;
          }
      }
    }
}