import java.util.*;
public class frequency{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

HashMap<Integer,Integer> freq=new HashMap<>();

for(int i=0;i<n;i++){
if(freq.containsKey(arr[i])){
int current=freq.get(arr[i]);
freq.put(arr[i],current+1);
}
else{
freq.put(arr[i],1);
}
}

System.out.println(freq);

}
}

