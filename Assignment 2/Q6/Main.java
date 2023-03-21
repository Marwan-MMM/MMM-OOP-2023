public class Main {
    public static void main(String[] args) {
        MyInteger i = new MyInteger(8);

        System.out.println(i.isEven());

        System.out.println(i.isOdd());

        System.out.println(i.isPrime());

        System.out.println(MyInteger.isEven(10));
        System.out.println(MyInteger.isOdd(10));
        System.out.println(MyInteger.isPrime(10));

        System.out.println(i.equals(48));
        System.out.println(i.equals(3));
        
        System.out.println(MyInteger.isEven(new MyInteger(3)));
        System.out.println(MyInteger.isOdd(new MyInteger(3)));
        System.out.println(MyInteger.isOdd(new MyInteger(3)));
        System.out.println(i.equals(new MyInteger(8)));
        System.out.println(i.equals(new MyInteger(4)));
    }
}