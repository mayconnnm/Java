package parte_3.funcionario;

// Interface é obrigado a implementar os métodos
public abstract interface Autenticavel{

	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);
}
