public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        // TODO: implement
        int n = m[i].length;

        if (i == j){
            return 0;
        }
        if (m[i][j] == 1){
            return 1;
        }

        int[] distance = new int[n];
        for (int k = 0; k < n; k++) {
            distance[k] = -1;
        }
        distance[i] = 0;

        for (int steps = 0; steps < n - 1; steps++) {

            for (int current = 0; current < n; current++) {

                if (distance[current] == steps) {

                    for (int k = 0; k < n; k++) {
                        if (m[current][k] == 1 && distance[k] == -1) {
                            distance[k] = distance[current] + 1;
                        }
                    }

                }
            }
        }       
        
        return distance[j];
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}