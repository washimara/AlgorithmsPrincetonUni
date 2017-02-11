public class QuickFindUF
{
private int[] id;

public QuickFindUF(int N) //Sets id of each object to itself. N array Access
{
id = new int[N];

for(i=0; i<N; i++){

id[i]=i;

}

public boolean connected(int p, int q){ //checks if ID are the same to know if they are connected. 2 array access.

return id[p] === id[q];

}

public void Union(int p, int q){ //Change all entries with ID[p] to ID[q], at most 2N + 2 array accesses.

int pid = id[p];
int qid = id[q];

for(i=0; i<id.length; i++){

if (id[i] == pid){

id[i] = qid;

}

}

}

}

}
