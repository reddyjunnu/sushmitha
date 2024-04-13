package programs;
public class largest {

    public static void main(String[] args) {

        double n1 = 6, n2 = 5, n3 = 15;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}

