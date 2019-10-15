package modelo.exceptions;

public class DomainException extends RuntimeException{
	/*N�o � obrigado a tratar RunTimeException

	/*
	 *  classes serializable podem ser convertidos em bytes e trafegar em rede
	 *  e por isso tem que ter um n�mero de vers�o
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
