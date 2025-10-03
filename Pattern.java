package Java;

public class Pattern {
    public static void characterPattern() {
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void diagonalOfSquare() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || i + j == 6) {
                    System.out.print("* "); // ⭐ Diagonal stars
                } else {
                    System.out.print("  "); // ⬜ Space
                }
            }
            System.out.println();
        }
    }

    public static void diamondPattern() {
        int n = 5;

        // 🔼 Upper Half
        for (int i = 1; i <= n; i++) {
            // ⬜ Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // ⭐ Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 🔽 Bottom Half
        for (int i = n - 1; i >= 1; i--) {
            // ⬜ Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // ⭐ Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle() {
        int n = 5, a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void halfPyramid() {
        int n = 5;
        // 🔼 Increasing Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // 🔽 Decreasing Half
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void hollowRectangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 7) {
                    System.out.print("* "); // ⭐ Border stars
                } else {
                    System.out.print("  "); // ⬜ Hollow space
                }
            }
            System.out.println();
        }
    }

    public static void hollowTriangleInsideSquare() {
        int n = 4;

        // 🔽 Top Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* "); // ⭐ Left stars
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  "); // ⬜ Middle space
            for (int j = 1; j <= i; j++)
                System.out.print("* "); // ⭐ Right stars
            System.out.println();
        }

        // 🔼 Bottom Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println();

        // 🔼 Bottom Half (again)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        // 🔽 Top Half (again)
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void hollowTriangle() {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i + j == 5 || j - i == 3 || i == n) {
                    System.out.print("* "); // ⭐ Outline stars
                } else {
                    System.out.print("  "); // ⬜ Hollow space
                }
            }
            System.out.println();
        }
    }

    public static void numberPyramid() {
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print("  "); // ⬜ Leading space
            for (int j = 1; j <= i; j++)
                System.out.print(a + "   "); // 🔢 Numbers
            System.out.println();
            a++;
        }
    }

    public static void palindromicPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print("  "); // ⬜ Leading space
            for (int j = 2; j <= i; j++)
                System.out.print(j + " "); // 🔢 Ascending
            for (int j = 1; j <= i; j++)
                System.out.print(j + " "); // 🔢 Descending
            System.out.println();
        }
    }

    public static void solidAndHollowRhombus() {
        // ⭐ Solid Rhombus
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" "); // ⬜ Leading space
            for (int j = 1; j <= 5; j++)
                System.out.print("* "); // ⭐ Stars
            System.out.println();
        }

        System.out.println();

        // 🧱 Hollow Rhombus
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print("  "); // ⬜ Leading space
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 5) {
                    System.out.print("* "); // ⭐ Border stars
                } else {
                    System.out.print("  "); // ⬜ Hollow space
                }
            }
            System.out.println();
        }
    }

    public static void triangle01Pattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 "); // 🔢 One
                } else {
                    System.out.print("0 "); // 🔢 Zero
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        characterPattern();
        System.out.println();
        diagonalOfSquare();
        System.out.println();
        diamondPattern();
        System.out.println();
        floydsTriangle();
        System.out.println();
        halfPyramid();
        System.out.println();
        hollowRectangle();
        System.out.println();
        hollowTriangleInsideSquare();
        System.out.println();
        hollowTriangle();
        System.out.println();
        numberPyramid();
        System.out.println();
        palindromicPattern();
        System.out.println();
        solidAndHollowRhombus();
        System.out.println();
    }
}