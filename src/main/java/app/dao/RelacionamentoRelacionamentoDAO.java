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
@Repository("RelacionamentoRelacionamentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface RelacionamentoRelacionamentoDAO extends JpaRepository<RelacionamentoRelacionamento, java.lang.String> {

  /**
   * Obtém a instância de RelacionamentoRelacionamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM RelacionamentoRelacionamento entity WHERE entity.id = :id")
  public RelacionamentoRelacionamento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de RelacionamentoRelacionamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM RelacionamentoRelacionamento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key relacionamento
   * @generated
   */
  @Query("SELECT entity FROM RelacionamentoRelacionamento entity WHERE entity.relacionamento.id = :id")
  public Page<RelacionamentoRelacionamento> findRelacionamentoRelacionamentosByRelacionamento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key relacionamento_1
   * @generated
   */
  @Query("SELECT entity FROM RelacionamentoRelacionamento entity WHERE entity.relacionamento_1.id = :id")
  public Page<RelacionamentoRelacionamento> findRelacionamentoRelacionamentosByRelacionamento_1(@Param(value="id") java.lang.String id, Pageable pageable);

}
