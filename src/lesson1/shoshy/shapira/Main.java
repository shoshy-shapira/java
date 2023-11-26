package lesson1.shoshy.shapira;

public class Main {
    public static boolean method1(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int method2(int number) {
        int num = 0;
        while (number > 0) {
            int digit = number % 10;
            num = num * 10 + digit;
            number /= 10;
        }
        return num;
    }

    public static boolean method3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i])
                return false;
        }
        return true;
    }

    public static void method4(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//מפחיתה ב-1 שלא יבדוק את המקום נ=האחרון{
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static int method5(String str, String subStr) {
        int i = -1, count = 0, n = str.length();
        while (n > 0) {
            i = str.indexOf(subStr);
            if (i != -1)//מה שאומר שנמצא מחרוזת
            {
                count++;
                str = str.substring(subStr.length() + 1);
                n = str.length();
            } else return count;

        }
        return count;

    }

    public static void method6(int[][] mat) {
        //המקומות הזוגיים יהיו 0
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if ((i + j) % 2 == 0)// אם חיבור משתני המקום הוא זוגי
                    mat[i][j] = 0;
                else
                    mat[i][j] = 1;
            }
        }
    }

    public static int[][] method7(int[][] mat1) {
        int[][] mat2 = new int[8][mat1[0].length];
        int row = mat1.length - 1;
        for (int i = 0; i < mat1.length; i++) {

            mat2[i] = mat1[row];
            row--;
        }
        return mat2;
    }


    public static void main(String[] args) {

        //1
        System.out.println("----1");
        System.out.println(method1(12));
        //2
        System.out.println("----2");
        System.out.println(method2(43376));

        //3
        System.out.println("----3");
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(method3(arr));

        //4
        System.out.println("----4");
        method4(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //5
        System.out.println("----5");
        System.out.println(method5("happyhappy", "ha"));

        //6
        System.out.println("----6");
        //הקצאת מטריצה ואיתחולה
        int[][] mat = new int[8][];
        for (int i = 0; i < mat.length; i++) {
            mat[i] = new int[8];
        }
        method6(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int y = 0; y < mat[i].length; y++) {
                System.out.print(mat[i][y]);
            }
            System.out.println();
        }

        System.out.println("----7");

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        method7(mat1);

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j]);
            }
            System.out.println();
        }


    }


}

