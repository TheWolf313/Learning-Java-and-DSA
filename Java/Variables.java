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
    static void TypesOfVariables(){
        int a=10;
        float b=20.5f;
        double c=30.5;
        char d='A'; //char stores single character as a number eg. A=65, B=66, C=67 lowercase a=97, b=98, c=99
        String e="Hello";
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);
        System.out.println("String: " + e);

    }
    public static void main(String[] args) {
        output();
        LeftTrianglePattern();
        TypesOfVariables();
    }
    
}