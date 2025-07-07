#include <stdio.h>
int main(){
    int n=5;
    // scanf("Enter the number of rows to print the X Pattern : %d",&n);

    int n1=n;
    if(n%2!=0){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    // printf("%d",i+1);
                    if(i==j)
                        printf("%d",i+1);
                    else if(i+j==n-1){
                        printf("%d",n1);
                    }
                }
                else{
                    printf(" ");
                }
            }
            printf("\n");
            n1--;
        }
    }
    else{
        printf("Unable to make the X pattern");
    }

    return 0;

}