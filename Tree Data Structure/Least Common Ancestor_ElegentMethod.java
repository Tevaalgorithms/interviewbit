public class LCA {

    boolean flag = false;
    int num = -1;

    public int lca(Node A, int B, int C) {
        dfs(A, B, C);
        return num;
    }

    public int dfs(Node root, int A, int B){
        int res = 0;

        if(root.data == A) {
            res++;
        }

        if(root.data == B) {
            res++;
        }

        if(root.left != null) {
            res += dfs(root.left, A, B);
        }

        if(root.right != null) {
            res += dfs(root.right, A, B);
        }

        if(res == 2 && flag == false) {
            flag = true;
            num = root.data;
        }
        
        return res;
    }
}
