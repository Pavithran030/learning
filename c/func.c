// #include <stdio.h>
// int arr[]={1,2,3,4};
// int main(){
//     int arr[]={1,2,3,4};
//     for(int i =0;i<sizeof(arr)/sizeof(arr[0]);i++){
//         printf("%d ",arr[i]);
        
//     }
//     return 0;
// }




#include<stdio.h>
int main(){
    int arr[50];
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++){
        if(arr[i]<0){
            arr[i]=0;
        }
    }
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
    return 0;
}


