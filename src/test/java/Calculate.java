public class Calculate {

    public Calculate(){

    }

    public static int sum(int a, int b){
        return a+b;
    }

    public int diff(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public float div(float a, float b){
        if(a>b){
            return a/b;
        }
        else{
            return b/a;
        }

    }

    public String getPair(int a, int b){
        return "{" + a + "," + b + "}";
    }

}
