package parte_3.funcionario;

// Interface � obrigado a implementar os m�todos
public abstract interface Autenticavel{

	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);
}
