public class Matrizes {
    public static void printa(Integer matriz[][]) {
        for (int i = 0; i < 10; ++i){
            for (int j = 0; j < 10; ++j){        
                System.out.print(matriz[i][j] + " ");        
            }  
            System.out.println();
        }
    }
    public static void aloca(Integer matriz[][]) {
        for(int i = 0; i < 10; ++i){
            for( int j = 0; j < 10; ++j){
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
    }
    public static void main(String args[]){
        Integer matriz[][] = new Integer[10][10];      
        aloca(matriz);
        printa(matriz);            
    }
}

