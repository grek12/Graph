public class Graph {
    private int V;
    private int Gr = 1;
    public int[][] Matrix;

    public Graph(int V) {
        this.V = V;
        Matrix = new int[V][V];
        for (int i = 1; i < V; i++) {
            Matrix[i][0] = i;
        }
        for (int i = 1; i < V; i++) {
            Matrix[0][i] = i;
        }
    }

    public final void addConnection(int src, int dest) {
        Matrix[src][dest] = 1;
        Matrix[dest][src] = 1;
    }

    public final void addGraph() {
        Gr++;
    }

    public final void removeGraph() {
        for (int i = 1; i < Gr; i++) {
            Matrix[i][Gr-1] = 0;
        }
        for (int i = 1; i < Gr; i++) {
            Matrix[Gr-1][i] = 0;
        }
        Gr--;
    }

    public final void removeConnection(int src, int dest) {
        Matrix[src][dest] = 0;
        Matrix[dest][src] = 0;
    }

    public final void printGraph() {
        for (int i = 0; i < Gr; i++) {
            for (int j = 0; j < Gr; j++) {
                System.out.print(String.format("%1$3s", Matrix[i][j]));
            }
            System.out.println();
        }
    }
}

