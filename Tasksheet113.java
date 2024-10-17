class Tasksheet113 {

    public static void main (String[] args){
        
        // H3110 w0r1d 2.0 true

        byte    a = 0;
        short   b = 1;
        int     c = 3;
        float   d = 2.0f;
        char    e = 'H';
        boolean f = true;

        String  g = Byte.toString(a);
        String  h = Short.toString(b);
        String  i = Integer.toString(c);
        String  j = Float.toString(d);
        String  k = Character.toString(e);

        String output = k+i+h+h+a+" "+"w"+g+"r"+h+"d"+" "+j+" "+f;
        System.out.println(output);

    }
}