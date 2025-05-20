package Task10.HomeworkTask01;

import java.util.LinkedList;
import java.util.List;

public class ListMethods {

     private LinkedList<Integer> list;

    public ListMethods(LinkedList<Integer> list) {
        this.list = list;
    }

    public LinkedList<Integer> getList() {
        return list;
    }

    public void setList(LinkedList<Integer> list) {
        this.list = list;
    }

    public LinkedList<Integer> firstToLast (LinkedList<Integer> list){
        Integer t = list.get(0);
       list.set(0,list.getLast());
       list.set(list.size()-1,t);
        return list;
   }

    public LinkedList<Integer> randomNumber (LinkedList<Integer> myCollection){
        for(int i = 0;i <= myCollection.size()-1; i++){
            if(myCollection.get(i) < 0 && i == 0){
                myCollection.set(i,666);
                return myCollection;
            }
            if(myCollection.get(i) < 0){
                myCollection.set(i-1,666);
                return myCollection;
            }
        }
        return myCollection;
    }

    public LinkedList<Integer> insertZero (LinkedList<Integer> myCollection){
        for (int i = 1; i < myCollection.size(); i++) {
            if(myCollection.get(i-1)>0 && myCollection.get(i)<0 || myCollection.get(i-1)<0 && myCollection.get(i)>0) {
                int delimiter = 0;
                myCollection.add(i, delimiter);
                i++;
            }
        }
        return myCollection;
    }

    public LinkedList<Integer> halfInOrder (LinkedList<Integer> myCollection){
        LinkedList<Integer> list1 = new LinkedList<>();
        int k = myCollection.size()/2;
        for (int i = 0; i < k; i++){
            list1.add(myCollection.get(i));
        }
        System.out.println("LIST1 in direct order : " + list1);
        return list1;
    }

    public LinkedList<Integer> halfInReverse (LinkedList<Integer> myCollection){
        LinkedList<Integer> list2 = new LinkedList<>();
        int k = myCollection.size()/2;
        for (int i = myCollection.size()-1; i >= k; i--){
            list2.add(myCollection.get(i));
        }
        System.out.println("LIST2 in reverce order : " + list2);
        return list2;
    }

    public LinkedList<Integer> deleteMinimym (LinkedList<Integer> myCollection){
        

        return myCollection;
    }

}
