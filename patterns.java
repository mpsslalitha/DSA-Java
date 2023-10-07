import java.util.Scanner;

class patterns {
    /*
     * pattern1:
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    /*
     * pattern2:
     * 
     * *
     * * *
     * * * *
     * * * * *
     */

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    /*
     * pattern3:
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */

    public static void pattern3(int n) {

        for (int i = 0; i < n; i++) {
            int k = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    /*
     * pattern4:
     * 1
     * 22
     * 333
     * 4444
     * 55555
     */
    public static void pattern4(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k);
            }
            k++;
            System.out.println();
        }
        System.out.println("=============================================");
    }

    /*
     * pattern5:
     * * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void pattern5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    /*
     * pattern6:
     * 12345
     * 1234
     * 123
     * 12
     * 1
     */
    public static void pattern6(int n) {

        for (int i = n; i > 0; i--) {
            int k = 1;
            for (int j = i; j > 0; j--) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern8(int n) {
        int k = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * k + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            k--;
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
        System.out.println("=============================================");
    }

    public static void pattern10(int n) {
        pattern2(n);
        pattern5(n - 1);
        System.out.println("=============================================");
    }

    public static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern12(int n) {
        int k = n;
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num++);
            }
            for (int j = 0; j < 2 * k - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(--num);
            }
            k--;
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern13(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern14(int n) {

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern15(int n) {

        for (int i = n; i > 0; i--) {
            char ch = 'A';
            for (int j = i; j > 0; j--) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern16(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < breakPoint)
                    ch++;
                else
                    ch--;
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();

        }
        System.out.println("=============================================");
    }

    public static void pattern19(int n) {
        int space = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }

        space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern20(int n) {
        int space = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }

        space = 2;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("=============================================");
    }

    /*
     * pattern22:
     * 5 5 5 5 5 5 5 5 5
     * 5 4 4 4 4 4 4 4 5
     * 5 4 3 3 3 3 3 4 5
     * 5 4 3 2 2 2 3 4 5
     * 5 4 3 2 1 2 3 4 5
     * 5 4 3 2 2 2 3 4 5
     * 5 4 3 3 3 3 3 4 5
     * 5 4 4 4 4 4 4 4 5
     * 5 5 5 5 5 5 5 5 5
     */

    public static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int btm = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, btm), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
        System.out.println("=============================================");
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
        pattern18(n);
        pattern19(n);
        pattern20(n);
        pattern21(n);
        pattern22(n);
    }
}