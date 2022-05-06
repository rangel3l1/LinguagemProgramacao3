package br.com.ifms.tads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifms.tads.javabeans.Aluno;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
