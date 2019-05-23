package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela RELACIONAMENTORELACIONAMENTO
 * @generated
 */
@Entity
@Table(name = "\"RELACIONAMENTORELACIONAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.RelacionamentoRelacionamento")
public class RelacionamentoRelacionamento implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_relacionamento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Relacionamento relacionamento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_relacionamento_1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Relacionamento relacionamento_1;

  /**
   * Construtor
   * @generated
   */
  public RelacionamentoRelacionamento(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public RelacionamentoRelacionamento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém relacionamento
   * return relacionamento
   * @generated
   */
  
  public Relacionamento getRelacionamento(){
    return this.relacionamento;
  }

  /**
   * Define relacionamento
   * @param relacionamento relacionamento
   * @generated
   */
  public RelacionamentoRelacionamento setRelacionamento(Relacionamento relacionamento){
    this.relacionamento = relacionamento;
    return this;
  }

  /**
   * Obtém relacionamento_1
   * return relacionamento_1
   * @generated
   */
  
  public Relacionamento getRelacionamento_1(){
    return this.relacionamento_1;
  }

  /**
   * Define relacionamento_1
   * @param relacionamento_1 relacionamento_1
   * @generated
   */
  public RelacionamentoRelacionamento setRelacionamento_1(Relacionamento relacionamento_1){
    this.relacionamento_1 = relacionamento_1;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    RelacionamentoRelacionamento object = (RelacionamentoRelacionamento)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
