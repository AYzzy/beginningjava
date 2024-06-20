public class MostOccurenceNumber {
    public static void main(String[] args) {
        int[] a = {3,5,2,5,5,5,0};

        int mostFrequent = a[0];
        int maxCount = 1;

        for (int i = 0; i < a.length; i++) {
            int currentNumber = a[i];
            int currentCount = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == currentNumber) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount) {
                mostFrequent = currentNumber;
                maxCount = currentCount;
            }
        }

        System.out.println("The most frequent number is: " + mostFrequent);
    }
}
