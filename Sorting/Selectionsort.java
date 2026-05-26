import java.util.*;
public class Selectsort{
public static void Select(int arr[],int n){

for(int i=0;i<=n-2;i++){
int min=i;
for(int j=i;j<=n-1;j++){

if(arr[min]>arr[j]){
min=j;
}
}

int temp=arr[min];
arr[min]=arr[i];
arr[i]=temp;
}

}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
Select(arr,n);
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
}


