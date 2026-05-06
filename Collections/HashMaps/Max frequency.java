// Problem: Maximum Frequency Element
// Platform:Hive
// Approach: Use HashMap to store frequencies, then find element with maximum frequency
// Time Complexity: O(n)
// Space Complexity: O(n)




import java.util.*;
public class Maxfreq{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

HashMap<Integer,Integer> freq=new HashMap<>();

int maxfreq=0;
int maxele=0;


for(int i=0;i<n;i++){

if(freq.containsKey(arr[i])){
int current=freq.get(arr[i]);
freq.put(arr[i],current+1);
}
else{
freq.put(arr[i],1);
}
}

for(int i=0;i<n;i++){
if(freq.containsKey(arr[i])){
int current=freq.get(arr[i]);
if(current>maxfreq){

maxfreq=current;
maxele=arr[i];

}
}
}
System.out.println(maxfreq);


System.out.println(maxele);

}
}

