package io.github.ian_schmechel.libraryapi.repository;

import io.github.ian_schmechel.libraryapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
