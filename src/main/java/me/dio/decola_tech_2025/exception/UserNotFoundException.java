package me.dio.decola_tech_2025.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(Long id) {
        super(String.format("Usuário não encontrado com o ID: %d", id));
    }

    public UserNotFoundException(String accountNumber, String type) {
        super(String.format("Usuário não encontrado com o número de conta %s", accountNumber));
    }
} 