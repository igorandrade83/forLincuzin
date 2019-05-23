package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @param nome
 * @param sobrenome
 * @return Var
 */
// Bloco
public static Var VaiClass2(Var nome, Var sobrenome) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/home/logged/class2"), cronapi.list.Operations.newList(Var.valueOf("p1",nome),Var.valueOf("p2",sobrenome)));
    System.out.println(Var.valueOf(Var.valueOf("VaiClass2: ").toString() + nome.toString()).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var recebeClass2() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(Var.valueOf(Var.valueOf("Parametro p1: ").toString() + cronapi.screen.Operations.getParam(Var.valueOf("p1")).toString() + Var.valueOf(".").toString()).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

