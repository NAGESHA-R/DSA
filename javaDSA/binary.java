package javaDSA;

public class binary {
    public static void main(String[] args) {
        String a="1C0C1C1C1A0B1";
        StringBuilder b=new StringBuilder();
        for(int i=1;i<a.length();i++){
            char value=a.charAt(i);
            char d;
            if(value=='A'){
                d=(char)((a.charAt(i-1))&(a.charAt(i+1)));
                b.append(d);
            }
            else if(value=='B'){
                d=(char)((a.charAt(i-1))|(a.charAt(i+1)));
                b.append(d);
            }
            else if(value=='C'){
                d=(char)((a.charAt(i-1))^(a.charAt(i+1)));
                b.append(d);
            }
        }

        System.out.println(b);
    }
}
