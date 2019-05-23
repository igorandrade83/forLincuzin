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
@Repository("filhosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface filhosDAO extends JpaRepository<filhos, java.lang.String> {

  /**
   * Obtém a instância de filhos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM filhos entity WHERE entity.id = :id")
  public filhos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de filhos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM filhos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key chang
   * @generated
   */
  @Query("SELECT entity FROM filhos entity WHERE entity.chang.id = :id")
  public Page<filhos> findfilhossByChang(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key rodigo
   * @generated
   */
  @Query("SELECT entity FROM filhos entity WHERE entity.rodigo.id = :id")
  public Page<filhos> findfilhossByRodigo(@Param(value="id") java.lang.String id, Pageable pageable);

}
