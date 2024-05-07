class Str{
    public static void main(String[] args) {
        String a = "Hello World";
        char[] b = a.toCharArray();
        String c = new String("Hello World");
        if (a.equals(c)){
            System.out.println(true);

        }
        else{

            System.out.println(false);
            System.out.println(b);
        }
        for (int i =0;i<b.length;i++){
            System.out.println(i + " " +b[i]);
        }
        System.out.println(a.codePointCount(2, 5));
    }
}