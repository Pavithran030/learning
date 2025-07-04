#include <stdio.h>

int main() {
    int a;
    scanf("%d",&a); 
    int lo;
    int re=0;
    int a1=a;
    while(a1>0){
        int re1=1;
        lo=a1%10;
        for(int i=1;i<=lo;i++){
            re1*=i;
        }
        a1/=10;
        re+=re1;
    }
    if(re==a){
        printf("It is a strong number.");
    }
    else{
        printf("It is not a strong number.");
    }
    return 0;
}