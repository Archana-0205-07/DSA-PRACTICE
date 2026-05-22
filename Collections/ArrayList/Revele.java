import java.util.ArrayList;
public class Revele{
public static void main(String[] args){
ArrayList<Integer>list =new ArrayList<>();
list.add(20);
list.add(30);
list.add(10);
for(int i=list.size()-1;i>=0;i--){
System.out.println(list.get(i));
}
}
}
