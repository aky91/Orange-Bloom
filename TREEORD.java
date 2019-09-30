// https://www.spoj.com/problems/TREEORD/
// Accepted

import java.io.*;
import java.lang.*;
import java.util.*;

class TreeNode
{
    int id;
    TreeNode left, right;
    
    public TreeNode(int id) {
        this.id = id;
        left = right = null;
    }
}

public class TREEORD
{
    public static int index;
    public static boolean valid;

    public static void getInput(int[] order, Scanner scan) {
        for(int i = 0; i < order.length; i++) {
            order[i] = scan.nextInt();
        }
    }

    public static void postOrderTraversal(TreeNode root, int[] postorder)
    {
        if(root == null) return;

        if(valid) postOrderTraversal(root.left, postorder);
        if(valid) postOrderTraversal(root.right,postorder);

        if(root.id != postorder[index++]) {
            valid = false;
        }
    }

    public static TreeNode constructTree(int start, int end,
    int[] preorder, HashMap<Integer,Integer> map)
    {
        if(start > end) return null;

        int key = preorder[index++];
        TreeNode head = new TreeNode(key);

        head.left = constructTree(start, map.get(key)-1, preorder, map);
        head.right = constructTree(map.get(key)+1, end, preorder, map);

        return head;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int pre[] = new int[n];
        int pos[] = new int[n];
        int ino[] = new int[n];
        
        getInput(pre, scan);
        getInput(pos, scan);
        getInput(ino, scan);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(ino[i], i);
        }

        index = 0;
        TreeNode root = constructTree(0, n-1, pre, map);

        index = 0;
        valid = true;
        postOrderTraversal(root, pos);

        if(valid == true) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

// 1 2 4 5 3 6 | pre
// 4 2 5 1 3 6 | inorder

// 4 5 2 6 3 1 | post