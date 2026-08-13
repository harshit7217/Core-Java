package inheritance.basic;

//SubClass
public class B extends A{
    int k;

    public void showK(){
        System.out.println("k :"+ k);
    }

    public void sum(){
        System.out.println("i + j + k: "+ (i + j + k));
    }
}
