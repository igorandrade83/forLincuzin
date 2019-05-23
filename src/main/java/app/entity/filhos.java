package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FILHOS
 * @generated
 */
@Entity
@Table(name = "\"FILHOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.filhos")
public class filhos implements Serializable {

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
  @JoinColumn(name="fk_chang", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private chang chang;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_rodigo", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private rodigo rodigo;

  /**
   * Construtor
   * @generated
   */
  public filhos(){
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
  public filhos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém chang
   * return chang
   * @generated
   */
  
  public chang getChang(){
    return this.chang;
  }

  /**
   * Define chang
   * @param chang chang
   * @generated
   */
  public filhos setChang(chang chang){
    this.chang = chang;
    return this;
  }

  /**
   * Obtém rodigo
   * return rodigo
   * @generated
   */
  
  public rodigo getRodigo(){
    return this.rodigo;
  }

  /**
   * Define rodigo
   * @param rodigo rodigo
   * @generated
   */
  public filhos setRodigo(rodigo rodigo){
    this.rodigo = rodigo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    filhos object = (filhos)obj;
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
