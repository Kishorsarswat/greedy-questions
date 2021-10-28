package BinSearchtree.java;

public class bst{
    public static void main(String[] args) {
        tree bst = newNode(10); 
        insert(14, bst);
        insert (2,bst);	
        insert (14,bst);	
        insert (17,bst);	
        insert (7,bst);	
        insert (1,bst);			
        insert (8,bst);	
        insert (19,bst);	
        insert (4,bst);	
        insert (11,bst);	
        insert (16,bst);	

        int ans = search(1, bst);
        if(ans==0)
            System.out.println("Not Found");
        else
            System.out.println("Found "+ans);

        inorder(bst);
        System.out.println();

    }

    static tree newNode(int data){
        tree newTree = new tree();
        newTree.val=data;

        return newTree;
    }

    static void insert(int data, tree root){
        if(root.val<data){
            if(root.right!=null){
                insert(data, root.right);
            }else{
                tree temp = newNode(data);
                root.right=temp;
            }
        }else if(root.val>data) {
            if(root.left!=null){
                insert(data, root.left);
            }else{
                tree temp = newNode(data);
                root.left=temp;
            }
        }
    }

    static int search(int data, tree root){
        if(root!=null){
            if (root.val<data){
                if (root.right!=null){
                    return search(data,root.right);
                }else{
                    return 0;
                }
            }else if (root.val>data){
                if (root.left!=null){
                    return search(data,root.left);
                }else{
                    return 0;
                }
            }else if (root.val==data){
                return data;
            }
        }
        return 0;
    }

    static void inorder(tree root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.val+" ");

        inorder(root.right);
    }
}

class tree{
    public tree right;
    public tree left;
    public Integer val;
}

