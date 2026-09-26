package array;
//# For printing the transpose of a matrix:-
// import java.util.*;
// public class Arrays {
//     public static void main(String[]args){

//         Scanner sc=new Scanner(System.in);
//         int row=sc.nextInt();
//         int column=sc.nextInt();
//         int[][] matrix=new int[row][column];
//         for(int i=0;i<row;i++){
        
//             for(int j=0;j<column;j++){
//                 matrix[i][j]=sc.nextInt();
//             }    
//         }
        
//         for(int i=0;i<column; i++){
//             for(int j=0;j<row;j++){
//                 System.out.print(matrix[j][i]+" ");
//             }
            
            

            
//             System.out.println();
//         }
//     }
// }
                
                    
                
 
//# For printing the transpose of a matrix:-
import java.util.*;
public class arrayquestions {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] matrix=new int[row][column];
        for(int i=0;i<row;i++){
        
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }    
        }
        
        for(int i=0;i<column; i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[j][i]+" ");
            }
            
            

            
            System.out.println();
        }
    }
}
                
                    
                
 
