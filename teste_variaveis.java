import java.util.*;

public class teste_variaveis {
	public static int x;
	public static int y;
	public static int res;
	public static float f;
	public static char z;
	public static boolean b;
	public static int mq[][] = new int[5][4];
	public static String ma[] = new String[10];

	public static void main(String[] args){
		if(x == 2 && y >= 10 || b){
			if(x < 2){
				z = 'A';
				System.out.println("nao eh dois");
			}else{
				z = 'B';
				z = 'C';
				System.out.println("nao eh dois");
			}

		}

		Scanner ler_1 = new Scanner(System.in);
		f = ler_1.nextFloat();
		Scanner ler_2 = new Scanner(System.in);
		x = ler_2.nextInt();
		while(x != 0){
			System.out.println(x);
			x = x - 1;
		}

		Scanner ler_3 = new Scanner(System.in);
		x = ler_3.nextInt();
		for(x=1; x<10; x++){
			res = res * x;
		}

		for(x=1; x>y; x=x-1){
			res = res * x;
		}

	}
}
