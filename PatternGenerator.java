public class PatternGenerator {
    
    public static void main(String[] args) {
        System.out.println("🎨 GENERADOR DE PATRONES BONITOS 🌟\n");
        
        // Patrón 1: Triángulo de estrellas
        System.out.println("🔺 Triángulo de Estrellas:");
        drawTriangle(5);
        
        // Patrón 2: Diamante
        System.out.println("\n💎 Diamante:");
        drawDiamond(5);
        
        // Patrón 3: Corazón
        System.out.println("\n❤️  Corazón:");
        drawHeart();
        
        // Patrón 4: Espiral
        System.out.println("\n🌀 Espiral:");
        drawSpiral(5);
    }
    
    // Método para dibujar triángulo
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
    
    // Método para dibujar diamante
    public static void drawDiamond(int size) {
        // Parte superior
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("♦");
            }
            System.out.println();
        }
        
        // Parte inferior
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("♦");
            }
            System.out.println();
        }
    }
    
    // Método para dibujar corazón
    public static void drawHeart() {
        String[] heart = {
            "  ♥♥♥   ♥♥♥  ",
            " ♥♥♥♥♥ ♥♥♥♥♥ ",
            "♥♥♥♥♥♥♥♥♥♥♥♥♥",
            " ♥♥♥♥♥♥♥♥♥♥♥ ",
            "  ♥♥♥♥♥♥♥♥♥  ",
            "   ♥♥♥♥♥♥♥   ",
            "    ♥♥♥♥♥    ",
            "     ♥♥♥     ",
            "      ♥      "
        };
        
        for (String line : heart) {
            System.out.println(line);
        }
    }
    
    // Método para dibujar espiral simple
    public static void drawSpiral(int size) {
        char[][] spiral = new char[size][size];
        
        // Inicializar con puntos
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                spiral[i][j] = '·';
            }
        }
        
        // Crear espiral
        int x = 0, y = 0;
        char[] symbols = {'→', '↓', '←', '↑'};
        int dir = 0;
        
        for (int i = 0; i < size * size; i++) {
            spiral[y][x] = symbols[dir % 4];
            
            // Cambiar dirección
            if (dir % 4 == 0 && (x == size - 1 || spiral[y][x + 1] != '·')) dir++;
            else if (dir % 4 == 1 && (y == size - 1 || spiral[y + 1][x] != '·')) dir++;
            else if (dir % 4 == 2 && (x == 0 || spiral[y][x - 1] != '·')) dir++;
            else if (dir % 4 == 3 && (y == 0 || spiral[y - 1][x] != '·')) dir++;
            
            // Moverse
            if (dir % 4 == 0) x++;
            else if (dir % 4 == 1) y++;
            else if (dir % 4 == 2) x--;
            else if (dir % 4 == 3) y--;
        }
        
        // Imprimir espiral
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }
}