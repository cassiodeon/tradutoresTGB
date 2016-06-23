import java.util.*;

public class bem_vindo {
	public static char sexo;

	public static void main(String[] args){
		System.out.println("Qual o seu sexo :");
		Scanner ler_1 = new Scanner(System.in);
		sexo = ler_1.next().charAt(0);
		System.out.println("Ola ");
		if(sexo == 'm'){
			System.out.println("Homem");
		}else{
			if(sexo == 'f'){
				System.out.println("Mulher");
			}else{
				System.out.println("Sexo indefinido");
			}

		}

		System.out.println(" , bemvindo ao portugol");
	}
}
