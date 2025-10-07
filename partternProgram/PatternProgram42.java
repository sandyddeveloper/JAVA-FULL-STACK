/* 

55555
44444
33333
22222
11111


*/

class PatternProgram42 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {  // loop from 5 to 1
            for (int j = 1; j <= n; j++) {  // print n times per row
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
