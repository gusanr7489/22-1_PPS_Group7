import java.util.List;
import java.util.ArrayList;

class Solution {
    List<Integer> list = new ArrayList<>();
    
    public boolean findTarget(TreeNode root, int k) {
       boolean find = false;
       inorder(root, list);
       for(int i=0; i<list.size(); i++){
           if(k-list.get(i) != list.get(i) && list.contains(k - list.get(i))){
               find  = true;
               break;
           }
       }
       return find;
    }
    
    public void inorder(TreeNode root, List list) {
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
