algoritmo bem_vindo;

variáveis

    sexo: caractere;

fim-variáveis

início
    imprima("Qual o seu sexo :");
    sexo := leia();
    imprima("Ola ");

    se sexo = 'm' então
        imprima("Homem");
    senão
        se sexo = 'f' então
            imprima("Mulher");
        senão
            imprima("Sexo indefinido");
        fim-se    
    fim-se

    imprima("bemvindo ao Gportugol");

fim