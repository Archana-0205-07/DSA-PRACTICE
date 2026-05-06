// Problem: First Non-Repeating Element
// Platform: Hive/GFG
// Approach: Use HashMap to store frequency, then traverse to find first element with frequency = 1
// Time Complexity: O(n)
// Space Complexity: O(n)



import java.util.*;
public class FirstNonrepeat{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
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
for(int i=0;i<n;i++){
if(hp.get(arr[i])==1){
System.out.println(arr[i]);
break;
}
}
}
}
