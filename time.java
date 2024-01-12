public class time {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++; // Increment i in every iteration

            if (i % 2 == 0) {
                i++; // Increment again if i is even
            }
        }
    }
}
