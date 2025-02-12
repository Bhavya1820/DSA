public class SpiralMatrix {

    public static void Spiral(int matrix[][]){
        int startRow= 0;
        int startColoumn= 0;
        int endRow= matrix.length-1;
        int endColoumn= matrix[0].length-1;

        while(startRow <= endRow && startColoumn <= endColoumn){
        
            //Top
            for(int i=startColoumn; i<=endColoumn; i++){
                System.out.print(matrix[startRow][i]+" ");
            }

            //Right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endColoumn]+" ");
            }
            
            //Bottom
            for(int i=endColoumn-1; i>=startColoumn; i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }

            //Left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startColoumn == endColoumn){
                    break;
                }
                System.out.print(matrix[i][startColoumn]+" ");
            }

            startColoumn++;
            startRow++;
            endColoumn--;
            endRow--;

        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][]){
        int sum=0;
        
        for(int i=0; i<matrix.length; i++){
            //primary diagonal sum
            sum += matrix[i][i];

            //secondary diagonal sum
            if(i != matrix.length-i-1)
            sum += matrix[i][matrix.length-i-1];
        }

        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        int row=0, col= matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]= {
                         {1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         { 13, 14, 15, 16}
                        };
    
        staircaseSearch(matrix, 12);
    }
}
