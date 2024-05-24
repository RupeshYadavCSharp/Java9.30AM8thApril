package pack_classobj;

public class Number {
    private int num1,num2,num3;
    public void setnum(int n1,int n2,int n3){
        num1=n1;
        num2=n2;
        num3=n3;
    }
    public int getGreater(){
        if(num1>num2 && num1>num3){
            int grater=num1;
            return grater;
        }
        else if(num3>num1 && num3>num2){
            int grater=num3;
            return grater;

        }
        else if(num2>num1 && num2>num3){
            int grater=num2;
            return grater;
        }
        return 0;

    }

    public int getSmall(){
        if(num1<num2 && num1<num3){
            int smaller=num1;
            return smaller;
        }
        else if(num2<num1 && num2<num3){
            int smaller=num2;
            return smaller;

        }
        else if(num3<num1 && num3<num2){
            int smaller=num3;
            return smaller;
        }
        return 0;
    }

}
