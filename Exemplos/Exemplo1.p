algoritmo teste_variaveis;

variáveis
	x, y	: inteiro;
    z       : caractere;
    mq      : matriz[5][4] de inteiros;
    ma      : matriz[10] de literais;
fim-variáveis

início
	se (x = 2 e x = 10) então
		z := 'A';
		imprima("nao eh dois");
	senão
		z := 'B';
		imprima("nao eh dois");
	fim-se
fim