algoritmo fatorial;

variáveis
    x : inteiro;
fim-variáveis

início
    imprima("Digite um número:");
	x := leia();
    imprima("fatorial de ",x," é igual a ",fatorial(x));
fim

função fatorial(z:inteiro) : inteiro
    w : inteiro;
início
    se z = 1 então
        retorne 1;
    senão
        retorne z * fatorial(z-1);
    fim-se
fim