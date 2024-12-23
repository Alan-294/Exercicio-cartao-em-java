package Compras;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pegaValor = new Scanner(System.in);
        Cartao cartao = new Cartao();

        System.out.println(("Digite o limite do cartão: "));
        double a = Double.parseDouble(pegaValor.nextLine());
        cartao.setLimite(a);


        int i = 0;
        while(true){
            System.out.println("Limite do cartao: R$"+ cartao.getLimite());
            System.out.println("Fatura do cartao: R$"+ cartao.getFatura());
            System.out.println("Compras realizadas: "+ cartao.getCompras());

            System.out.println("Digite 0 para adicionar nova compra ou digite qualquer outro valor para encerrar");
            i = pegaValor.nextInt();

            if (i != 0){
                System.out.println("Obrigado por usar nosso sistema!");
                break;
            }

            Produto novoP = new Produto();
            double preco = 0.0;

            System.out.println("Digite o nome do produto: ");
            String nome = pegaValor.next();
            novoP.setDescricao(nome);

            System.out.println("Digite o valor do produto: ");
            preco = pegaValor.nextDouble();
            novoP.setPreco(preco);


            if (cartao.getLimite() < cartao.getFatura() + novoP.getPreco()){
                System.out.print("""
                       Erro ao adicionar compras, o valor da fatura vai estourar o limite do cartão:
                       Limite do cartão: """+ cartao.getLimite() +"""
                       
                       
                       Fatura do cartão: R$"""+ cartao.getFatura() +"""
                       
                       Possivel fatura do cartão com a nova compra: R$"""+ (cartao.getFatura() + novoP.getPreco()) +"""   
                                    
                       Compras realizadas:"""+ cartao.getCompras()+ """  
                       
                       Saindo do sistema.
                       """);
                break;
            }

            cartao.addCompras(novoP);
            System.out.println("O produto "+ novoP.getDescricao()+" foi adicionado com sucesso, adicionando R$"+ novoP.getPreco()+" a fatura do cartão");
        }
    }
    }
