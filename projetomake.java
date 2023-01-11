package makeprojeto;

public static void main(String[] args) {pacote  ProjetoJava ;

importar  java . . _ Scanner ;

import  DesenvolvimentoJava . Cliente ;
import  DesenvolvimentoJava . Produto ;

public  class  ProjetoStoreMake {

	public  static  void  principal ( String [] args ) {

		 int  categoria = 0 , subcategoria ;
	        Scanner  leia = novo  Scanner ( System . in );

	        Cliente  cliente = Acoes . dadosCliente ();
	        Produto [][] prod = Acoes . inicializaProdutos ();
	        
	        Sistema . fora . println ( "======================PROMOÇÃO========================\nEm compras acima de R$ 99,00 você será premiado \ncom um CUPOM de 10% na próxima compra ! " );
	        
	        while ( categ != 4 ) {
	            Sistema . fora . println ( "\n********************************************* *******" );
	            Sistema . fora . print ( "1 - Realce seus Labios\n" 	//Categorias
	                    + "2 - Encante com o olhar\n"
	                    + "3 - Make perfeita, pele perfeita\n"
	                    + "4 - Finalizar a compra\n"
	                    + "Qual categoria voce deseja ver?" );
	            categ = leia . proximoInt ();
	            Sistema . fora . println ( "************************************************* *****" );

	            if ( categoria > 0 && categoria < 4 ) {
	            		//Opções de produtos
	                Sistema . fora . print ( "\n1 -" + prod [ categ - 1 ][ 0 ]. getNome () + " (R$ " + prod [ categ - 1 ][ 0 ]. getValor ()+ ")\n" + prod [ categ - 1 ][ 0 ]. getDescricao ()+ "\n"
	                        + "\n2 -" + prod [ categ - 1 ][ 1 ]. getNome () + " (R$ " + prod [ categ - 1 ][ 1 ]. getValor ()+ ")\n" + prod [ categ - 1 ][ 1 ]. getDescricao ()+ "\n"
	                        + "\n3 -" + prod [ categ - 1 ][ 2 ]. getNome () + " (R$ " + prod [ categ - 1 ][ 2 ]. getValor ()+ ")\n" + prod [ categ - 1 ][ 2 ]. getDescricao ()+ "\n"
	                        + "\n4 - Menu Anterior\n"
	                        + "\nQual produto você deseja comprar?" );
	                subcategoria = leia . proximoInt ();

	                if ( subcategoria > 0 && subcategoria < 4 ) {
	                    Sistema . fora . print ( "Quantidade?" );
	                    prod [ categoria - 1 ][ subcategoria - 1 ]. setQtde ( leia . nextInt ());
	                } else  if ( subcategoria == 4 ){
	                    continuar ;
	                } senão {
	                    Sistema . fora . println ( "Código inválido" );
	                }
	            }
	            else  if ( categoria == 4 ) {
	                quebrar ;
	            }
	            outra coisa {
	                Sistema . fora . println ( "Opcao invalida!" );
	            }
	        }
	        Acoes . imprimeCompra ( cliente , prod );
	    }
	}
		// TODO Auto-generated method stub

	}

}
