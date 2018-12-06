public class MultiplicationTable_17 {

    public static void main(String args[]) {
        int row, col, y;
        System.out.println("multiplication table");
        row = 1;
        do {
            col = 1;
            do {
                y = row * col;
                System.out.print(" " + y);
                col = col + 1;
            }
            while (col <= 5);
            System.out.println("\n");
            row = row + 1;
        }
        while (row <= 5);
    }    }

