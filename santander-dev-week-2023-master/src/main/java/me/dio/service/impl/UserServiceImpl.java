package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;


import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public User atualizar(Long id, User cliente) {
        // Busca o usuário existente pelo ID
        User usuarioExistente = userRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Usuário não encontrado com o ID: " + id));

        // Atualiza as informações do usuário
        usuarioExistente.setAccount(cliente.getAccount());
        usuarioExistente.setCard(cliente.getCard());
        usuarioExistente.setFeatures(cliente.getFeatures());
        usuarioExistente.setId(id);
        usuarioExistente.setName(cliente.getName());
        usuarioExistente.setNews(cliente.getNews());
        
        return userRepository.save(usuarioExistente);
    }


    @Override
    public User deletar(Long id) {
        // Busca o usuário existente pelo ID
        User usuarioExistente = userRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Usuário não encontrado com o ID: " + id));

        // Deleta o usuário
        userRepository.delete(usuarioExistente);

        // Retorna o usuário que foi deletado
        return usuarioExistente;
    }

}
