import java.util.*;
public class Seclarele{
public static void main(String[] args){
ArrayList<Integer>list =new ArrayList<>();
list.add(20);
list.add(30);
list.add(10);

Collections.sort(list);

System.out.println(list.get(list.size()-2));
}
}



