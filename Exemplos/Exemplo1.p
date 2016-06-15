algoritmo teste_variaveis;

variáveis
	x, y	: inteiro;
    z       : caractere;
    b       : lógico;
    mq      : matriz[5][4] de inteiros;
    ma      : matriz[10] de literais;
fim-variáveis

início
	se x = 2 e y >= 10 ou não b então
		se x < 2 então
            z := 'A';
    		imprima("nao eh dois");
    	senão
    		z := 'B';
    		imprima("nao eh dois");
    	fim-se
    fim-se

    enquanto x <> 0 faça
        imprima(x);
        x := x - 1;
    fim-enquanto

    para x de 1 até 10 faça
        res := res * x;
    fim-para

    para x de 1 até y passo -1 faça
        res := res * x;
    fim-para
fim