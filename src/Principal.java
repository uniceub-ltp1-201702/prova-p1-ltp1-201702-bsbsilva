import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		//NOME: DANIEL LOPES DA SILVA
		//RA: 21606013
		
		
		
		BDSimulado bds = new BDSimulado ();
		
		
		//(2A) 
		System.out.println("informa��e dos clientes ");
		System.out.println(bds.getInfoCliente("Evandro da Silva"));
		System.out.println(bds.getInfoCliente("Maria do Socorro"));
		
		//(2B)
		System.out.println("Liga��es por Cliente");
		ArrayList<Ligacao> ligacoesPorCliente = bds.ligacoesPorCliente("Maria do Socorro");
		for (int i = 0; i < ligacoesPorCliente.size(); i++) {
			System.out.println(ligacoesPorCliente.get(i));
		}
		//(2C)
		System.out.println("Liga��es de uma UF");
		System.out.println(bds.ligacoesPorUF("RJ"));
		System.out.println(bds.ligacoesPorUF("SP"));
		
		//(2D)  
		
		ArrayList<Integer> ligacoesUFDiferente = bds.ligacoesUFDiferente();
		for (int i = 0; i < ligacoesUFDiferente.size(); i++) {
			System.out.println(ligacoesUFDiferente.get(i));
		}

		//(3A)
		ArrayList<Ligacao> contaCliente = bds.contaCliente("Jos� das Couves");
		for (int i = 0; i < contaCliente.size(); i++) {
			System.out.println(contaCliente.get(i));

		}
		
	}
	}

