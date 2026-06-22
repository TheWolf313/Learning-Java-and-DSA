class Variables {
    static void output(){
        System.out.println("Hello World!");
    }
    static void LeftTrianglePattern(){
        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=0;j<4;j++){
                if(j<=i)
                System.out.print("* ");
            }
        }
    }
    public static void main(String[] args) {
        output();
        LeftTrianglePattern();
    }
    
}