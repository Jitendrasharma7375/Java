//Given two binary trees, the task is to find if both of them are identical or not.
//Example 1:
//Input:
//     1          1
//   /   \      /   \
//  2     3    2     3
//Output: Yes
//Example 2:
//Input:
//     1          1
//   /   \      /   \
//  2     3    3     2
//Output: No
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(Height of the Tree).
//Constraints:
//1 <= Number of nodes <= 1000
//1 <=Data of a node <= 1000
public class IdenticalTrees {
    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        Node root2=new Node(1);
        root2.left=new Node(2);
        root2.right=new Node(3);
        System.out.println(isIdentical(root1,root2));
    }
    static boolean isIdentical(Node root1, Node root2)
    {
        if(root1==null && root2==null)
        {
            return true;
        }
        if(root1==null || root2==null)
        {
            return false;
        }
        if(root1.data!=root2.data)
        {
            return false;
        }
        return isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
    }
}
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
