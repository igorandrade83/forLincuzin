package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PessoaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PessoaDAO extends JpaRepository<Pessoa, java.lang.String> {

  /**
   * Obtém a instância de Pessoa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pessoa entity WHERE entity.id = :id")
  public Pessoa findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pessoa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pessoa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Pessoa entity WHERE entity.pessoa_0.id = :id")
  public Page<Pessoa> findPessoa(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key pessoa_0
   * @generated
   */
  @Query("SELECT entity FROM Pessoa entity WHERE entity.pessoa_0.id = :id")
  public Page<Pessoa> findPessoasByPessoa_0(@Param(value="id") java.lang.String id, Pageable pageable);

}
