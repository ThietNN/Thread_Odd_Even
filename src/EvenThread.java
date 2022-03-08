import java.util.ArrayList;

public class EvenThread extends Thread{
    public void run(){
        ArrayList<Integer> result = getEven(1,10);
        try {
            for (Integer integer : result) {
                System.out.println(integer);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> getEven(int from, int to){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = from; i < to; i++){
            if (i%2 != 0){
                result.add(i);
            }
        }
        return result;
    }
}
