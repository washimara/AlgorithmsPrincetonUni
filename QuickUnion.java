public class QuickUnionUF
{
private int[] id;

public QuickUnionUF(int N) //Sets id of each object to itself. N array Access
{
id = new int[N];

for(i=0; i<N; i++){

id[i]=i;

}

public int root(int i){ //chase parent pointers untill root is reached. Depth if i array accesses

while(i != id[i]){
i = id[i];
}

return i;

}

public boolean connected(int p, int q){ //checks if p and q have the same root. Depth of p and q array accesses

return root[p] == root[q];

}

public void Union(int p, int q){ //Change root of p to point ot root of q. Depth of p and q array accesses.

int i = root(p);
int j = root(q);

id[i] == j;

}

}
