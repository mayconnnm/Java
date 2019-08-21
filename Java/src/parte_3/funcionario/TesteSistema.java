package parte_3.funcionario;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(1022);

//		SistemaInterno si = new SistemaInterno();
//		si.autentica(g);

		Administrador adm = new Administrador();
		adm.setNome("haha");
		adm.setCpf("10101010");
		adm.setSalario(5000);
		adm.setSenha(1020);
//		si.autentica(adm);

	}
}
