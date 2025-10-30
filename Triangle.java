 public static void drawTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Espacios
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Estrellas
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }