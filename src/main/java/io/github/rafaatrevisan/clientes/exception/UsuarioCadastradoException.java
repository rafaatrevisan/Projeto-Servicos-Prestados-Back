package io.github.rafaatrevisan.clientes.exception;

public class UsuarioCadastradoException extends RuntimeException {

    public UsuarioCadastradoException(){
        super("Este e-mail já está em uso. Por favor, utilize um e-mail diferente.");
    }
}
