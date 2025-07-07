#include <stdio.h>
int main(){
    int n=5;

    int n1=n;
    for (int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            if(i==j && i+j==n-1){
                if(i==j)
                    printf("%d",i+1);
                else
                    printf("%d",n1);                
            }
            else{
                printf(" ");
            }
        }
        n1--;
    }

    return 0;

}