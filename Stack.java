import java.util.Scanner;

public class Stack {
    private int max;
    private int[] st;
    private int top;

    public Stack(int s) {
        this.max = s;
        this.st = new int[s];
        this.top = -1;
    }

    public void push(int n) {
        if (top < max - 1) {
            st[++top] = n;
        } else {
            System.out.println("Invalid Operation Stack full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            System.out.println("Invalid Operation Stack Empty");
        } else
            top--;
    }

    boolean isEmpty() {
        return top != -1;
    }

    public int getsize() {
        return top;
    }

    public static void main(String[] args) {
        Stack st1 = new Stack(2);
        Stack st2 = new Stack(2);
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter Your choice");
            System.out.println("1- Enter element in 1st Stack");
            System.out.println("2- Enter element in 2nd Stack");
            System.out.println("3- Delete element in 1st Stack");
            System.out.println("4- Delete element in 2nd Stack");
            System.out.println("5- Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter any number");
                    int n = sc.nextInt();
                    st1.push(n);
                    if (st1.getsize() == st2.getsize() && st1.getsize() > -1)
                        System.out.println("Size of both stacks = " + (st1.getsize() + 1));
                    break;
                case 2:
                    System.out.println("Enter any number");
                    int n1 = sc.nextInt();
                    st2.push(n1);
                    if (st1.getsize() == st2.getsize() && st1.getsize() > -1)
                        System.out.println("Size of both stacks = " + (st1.getsize() + 1));
                    break;
                case 3:
                    st1.pop();
                    if (st1.getsize() == st2.getsize() && st1.getsize() > -1)
                        System.out.println("Size of both stacks = " + (st1.getsize() + 1));
                    break;
                case 4:
                    st2.pop();
                    if (st1.getsize() == st2.getsize() && st1.getsize() > -1)
                        System.out.println("Size of both stacks = " + (st1.getsize() + 1));
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}