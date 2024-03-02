
public class Main {
    public static void main(String[] args) {
        IntArray myArray = new IntArray();

        int testLength = 1000;
        int testIndex = 100;

        for(int i=0; i<=testLength; ++i){
            myArray.add(i);
        }
        System.out.println(myArray.get(testIndex));
        myArray.remove(testIndex);
        System.out.println(myArray.get(testIndex));
    }
}
