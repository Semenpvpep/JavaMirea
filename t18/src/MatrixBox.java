public class MatrixBox<N> {
    private final N[][] matrix;
    int rows;
    int cols;
    public MatrixBox(N[][] matrix){
        this.matrix = matrix;
    }

    public Integer[][] MatrixPlus(N[][] matrixPlus){
        rows = matrix.length;
        cols = matrix[0].length;
        Integer[][] matrixFinal = new Integer[rows][cols];
        for (int i = 0; i < rows; i ++){
            for (int j = 0; j < cols; j++){
                matrixFinal[i][j] = (int)matrixPlus[i][j] + (int)matrix[i][j];
            }
        }
        return matrixFinal;
    }

    public Integer[][] MatrixMult(N[][] matrixMult){
        rows = matrix.length;
        cols = matrix[0].length;

        int rowsMult = matrixMult.length;

        Integer[][] matrixFinal = new Integer[cols][rowsMult];

        for (int i = 0; i < cols; i ++){
            for (int j = 0; j < rowsMult; j ++){
                matrixFinal[i][j] = 0;
                for (int k = 0; k < rows; k++){
                    matrixFinal[i][j] += (int)matrix[i][k] * (int)matrixMult[k][j];
                }
            }
        }
        return matrixFinal;
    }

    public Integer[][] MatrixK(int k1){
        rows = matrix[0].length;
        cols = matrix.length;
        Integer[][] matrixK = new Integer[rows][cols];
        for (int i = 0; i < rows; i ++){
            for (int j = 0; j < cols; j++){
                matrixK[i][j] = (int)matrix[i][j] * k1;
            }
        }
        return matrixK;
    }

    public void printMatrix(Integer[][] matrix){
        rows = matrix.length;
        cols = matrix[0].length;
        for (int i = 0; i < cols; i ++){
            for (int j = 0; j < rows; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}