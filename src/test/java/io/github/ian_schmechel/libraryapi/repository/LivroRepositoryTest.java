package io.github.ian_schmechel.libraryapi.repository;

import io.github.ian_schmechel.libraryapi.model.Autor;
import io.github.ian_schmechel.libraryapi.model.GeneroLivro;
import io.github.ian_schmechel.libraryapi.model.Livro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@SpringBootTest
class LivroRepositoryTest {

    @Autowired
    LivroRepository livroRepository;

    @Autowired
    AutorRepository autorRepository;

    @Test
    void salvarTest(){
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("UFO");
        livro.setDataPublicacao(LocalDate.of(1980, 1, 2));

        Autor autor = autorRepository
                .findById(UUID.fromString("874de12e-5270-471d-9bc9-4a24de908c36"))
                .orElse(null);

        livro.setAutor(autor);

        livroRepository.save(livro);
    }

}