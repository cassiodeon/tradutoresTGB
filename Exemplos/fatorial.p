algoritmo fatorial;

variáveis
    res     :inteiro;
    fat     :inteiro;
    x       :inteiro;
fim-variáveis

início
    imprima("Digite um número:");
	fat := leia();

    res := 1;
    para x de fat até 1 passo -1 faça
        res := res * x;
    fim-para

    imprima("fatorial de ",fat," é igual a ",res);
fim