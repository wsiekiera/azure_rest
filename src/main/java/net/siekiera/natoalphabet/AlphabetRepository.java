package net.siekiera.natoalphabet;

import org.springframework.data.repository.CrudRepository;

public interface AlphabetRepository extends CrudRepository<NatoAlphabet, Long> {
    public NatoAlphabet findByLetter(Character letter);
}
