public class Main {
    public static void main(String... args){
        Integer[][] matrix = new Integer[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        MatrixBox<Integer> matrixBox = new MatrixBox<Integer>(matrix);

        Integer[][] matrixTwo = new Integer[4][4];
        Integer[][] matrixTest;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matrixTwo[i][j] = (int)(Math.random() * 10);
            }
        }
        System.out.println("Первая матрица: \n");
        matrixBox.printMatrix(matrix);
        System.out.println("Вторая матрица: \n");
        matrixBox.printMatrix(matrixTwo);

        System.out.println("Сумма матриц: ");
        matrixTest = matrixBox.MatrixPlus(matrixTwo);
        matrixBox.printMatrix(matrixTest);

        System.out.println("Умножение матриц: ");
        matrixTest = matrixBox.MatrixMult(matrixTwo);
        matrixBox.printMatrix(matrixTest);

        System.out.println("Умножение на коэфф. k = 2: ");
        matrixTest = matrixBox.MatrixK(2);
        matrixBox.printMatrix(matrixTest);
    }
}