import java.util.*;

public class Solution{
    
    public static void main(String[] args) {

        int minimumPrice = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        List<Integer> containsDigitList = new ArrayList<Integer>();

        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int value = in.nextInt();

            hashMap.put(name, value);
        }

        for ( Map.Entry<String, Integer> entry : hashMap.entrySet() ) {
            if (Integer.toString(Integer.parseInt(String.valueOf(entry.getValue()))).contains("7") && Integer.toString(Integer.valueOf(entry.getValue())).contains("4")) {

                containsDigitList.add((int) entry.getValue());

            }
        }

        if( containsDigitList.isEmpty() ) {

            System.out.println("-1");

        }else{

            minimumPrice = containsDigitList.get(containsDigitList.indexOf(Collections.min(containsDigitList)));

            for ( Map.Entry<String, Integer> entry : hashMap.entrySet() ) {

                if(entry.getValue().equals(minimumPrice)) {
                    System.out.println(entry.getKey());
                }
            }
        }

        in.close();
    }
}
