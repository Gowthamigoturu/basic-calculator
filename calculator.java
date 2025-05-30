import java.util.Scanner;
abstract class calculator{
    abstract int add(int a,int b);
    abstract int sub(int a,int b);
    abstract int mul(int a,int b);
    abstract int div(int a,int b);
}
class solution extends calculator{
    public int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
}
class Main {
    public static void main(String[] args) {
        calculator c=new solution();
        Scanner s=new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println("----------------------------");
        while(true){
            System.out.println("enter your choice:");
            System.out.println("1.addition\n2.subraction\n3.multplication\n4.division\n5.exit");
            int choice=s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter first element:");
                    int a=s.nextInt();
                    System.out.println("enter second element:");
                    int b=s.nextInt();
                    System.out.println(c.add(a,b));
                    System.out.println("---------------------");
                    break;
                case 2:
                    System.out.println("enter first element:");
                    int i=s.nextInt();
                    System.out.println("enter second element:");
                    int d=s.nextInt();
                    System.out.println(c.sub(i,d));
                    System.out.println("---------------------");
                    break;
                case 3:
                    System.out.println("enter first element:");
                    int e=s.nextInt();
                    System.out.println("enter second element:");
                    int f=s.nextInt();
                    System.out.println(c.mul(e,f));
                    System.out.println("---------------------");
                    break;
                case 4:
                    System.out.println("enter first element:");
                    int g=s.nextInt();
                    System.out.println("enter second element:");
                    int h=s.nextInt();
                    System.out.println(c.div(g,h));
                    System.out.println("---------------------");
                    break;
                case 5:
                    System.out.println("THANK YOU!!!");
                    System.exit(0);
                    System.out.println("---------------------");
                    break;
                default:
                    System.out.println("invalid");
                    System.out.println("---------------------");
            }
        }
    }
}
