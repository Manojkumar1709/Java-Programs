public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 10;
        int b = 20;
        String s = "Java";
        System.out.println(a + " " + b + " ");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                System.out.print(i+j);
            }
            System.out.println();
        }
        for(int i = a; i >= 0; i--){
            for(int j = b; j >= 0; j--){
                System.out.print(i+j);
            }
            System.out.println();
        }
        
    }
}
