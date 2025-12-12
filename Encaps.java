class Calc{
    private int num1;
    private int num2;

    public void setNum1(int a){
        this.num1 = a;
    }

    public void setNum2(int b){
        this.num2 = b;
    }

    public int add(){
        return num1 + num2;
    }
}

public class Encaps {
    public static void main(String []args){
        Calc cal = new Calc();
         cal.setNum1(50);
         cal.setNum2(80);
         int res = cal.add();
         System.out.println(res);
    }
}
