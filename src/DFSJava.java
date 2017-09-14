import java.util.ArrayList;

public class DFSJava {

    /*int graph[][] = {
            {1},
            {2, 3},
            {4},
            {1},
            {2}
    };*/
    static ArrayList<ArrayList<Integer>> spA
            = new ArrayList<ArrayList<Integer>>();

    /*int graph[][] = {
                {0, 1, 0, 0, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0}
        };*/
    static int graph[][] = {
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 0, 0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0}

    };

    public int[][] getGraph() {
        return graph;
    }

    static boolean used[] = new boolean[graph.length];
    static ArrayList topSort = new ArrayList<Integer>();

    static void init() {
        for (int i = 0; i < graph.length; i++) {
            spA.add(new ArrayList<Integer>());
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == 1)
                    spA.get(i).add(j);
            }
            //spA.get(i).add(graph[i])
        }

        //System.out.println(used.length);

    }

    void dfs(int v) {
        //if (used[v])
        //return;
        used[v] = true;
        System.out.println(v);
        for (int i = 0; i < graph.length; i++) {
            //for (int i = 0; i <= spA.get(v).size(); i++) {
            if (!used[i] && graph[v][i] != 0) {
                dfs(i);
                //System.out.println(spA.get(v).get(i-1));
                //dfs(spA.get(v).get(i));
                //System.out.println(spA.get(v).get(i));
            }
            //topSort.add(i);
        }
        topSort.add(v);
    }

    static void getBool() {
        for (boolean i : used)
            System.out.println(i);
    }

    static void getArrayGraph() {
        for (int i = 0; i < spA.size(); i++) {
            for (int j = 0; j < spA.get(i).size(); j++) {
                //System.out.print(i+" : ");
                System.out.print(spA.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    static void getTopSort() {
        for (int i = 0; i < topSort.size(); i++) {
            System.out.println(topSort.get(i));
        }
    }

    public static void main(String[] args) {
        DFSJava dfs = new DFSJava();
        //init();
        //getArrayGraph();
        System.out.println();
        //System.out.println(spA.get(1).size());
        dfs.dfs(0);
        System.out.println();
        getTopSort();
    }
}
