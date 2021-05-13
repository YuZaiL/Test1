import java.util.Scanner;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        Scanner b = new Scanner(System.in);
        int n2 = scanner.nextInt();
        Number number = new Number(n1,n2);
        number.addition();
        number.subtration();
    }
}

class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void addition(){
//        System.out.println(n1+"+"+n2+"="+(n1+n2));
        System.out.println(this.getN1()+"+"+this.getN2()+"="+(this.getN1()+this.getN2()));
    }
    public void subtration(){
        int result=n1-n2;
        System.out.println(n1+"-"+n2+"="+result);
    }
    public void multiplication(){

    }
    public void division(){

    }
}
