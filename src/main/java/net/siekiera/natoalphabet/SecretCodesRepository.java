package net.siekiera.natoalphabet;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SecretCodesRepository extends CrudRepository<SecretCode, Long> {
    Optional<SecretCode> findByName(String name);
}
