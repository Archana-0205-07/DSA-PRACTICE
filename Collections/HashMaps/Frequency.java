import java.util.*;
public class Hashhm{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

//pre computing

HashMap<Integer,Integer>hp=new HashMap<>();
for(int i=0;i<n;i++){
if(hp.containsKey(arr[i])){
int curr=hp.get(arr[i]);
hp.put(arr[i],curr+1);
}
else{
hp.put(arr[i],1);
}
}


System.out.println("enter q");
int q=sc.nextInt();
while(q-->0){
System.out.println("enter number");

int number=sc.nextInt();

//fetch
if(hp.containsKey(number)){
System.out.println(hp.get(number));
}
else{
System.out.println(0);
}
}


}
}

