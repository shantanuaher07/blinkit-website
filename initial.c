#include<stdio.h>

int main(){
    int rows, cols;
    int matrix[10][10];
    int i, j;
    
    printf("Enter number of rows: ");
    scanf("%d", &rows);
    
    printf("Enter number of cols: ");
    scanf("%d", &cols);
    
    printf("Enter elements of the matrix:\n");
    
    // Reading matrix
    for(i = 0; i < rows; i++){
        for(j = 0; j < cols; j++){
            scanf("%d", &matrix[i][j]);
        }
    }
    
    printf("\nThe matrix is:\n");
    
    // Displaying matrix
    for(i = 0; i < rows; i++){
        for(j = 0; j < cols; j++){
            printf("%d ", matrix[i][j]);
        }
        printf("\n");   // New line after each row
    }
    
    return 0;
}