/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.controller;

import TrabalhoFinal.model.PresoModel;
import TrabalhoFinal.util.Conexao;

import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author andre
 */
public class PresoController {
    
    public List<PresoModel> listar() {
        
        Conexao conexao = new Conexao();
        java.sql.Connection con = conexao.conectar();
        String instrucao = "SELECT *FROM prisao";
        List<PresoModel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(instrucao);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                PresoModel preso = new PresoModel();
                preso.setIdPreso(rs.getInt(1));
                preso.setNome(rs.getString(2));
                preso.setDataNascimento(rs.getString(3));
                preso.setCpf(rs.getString(4));
                preso.setIdCela(rs.getInt(5));
                preso.setDataEntrada(rs.getString(6));
                preso.setPena(rs.getString(7));
                lista.add(preso);
            }
            return lista;
        }catch(Exception ex){
            System.err.println(ex);
            lista = null;
          }
        finally{
            conexao.encerrar(con);
            return lista;
        }
    } 
    
     public boolean inserir(PresoModel preso) {
        
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "INSERT INTO produto (id_preso, nome, data_nascimento, cpf , cela_id, data_entrada, pena_anos) VALUES (?,?,?,?,?,?,?)";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
            ps.setInt(1, preso.getIdPreso());
            ps.setString(2, preso.getNome());
            ps.setString(3, preso.getDataNascimento());
            ps.setString(4, preso.getCpf());
            ps.setInt(5, preso.getIdCela());
            ps.setString(6, preso.getDataEntrada());
            ps.setString(7, preso.getPena());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
           return retorno; 
        }
    }
     
     
     public boolean atualizar(PresoModel preso) {
         
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "UPDATE INTO produto (id_preso, nome, data_nascimento, cpf , cela_id, data_entrada, pena_anos) VALUES (?,?,?,?,?,?,?)";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
            ps.setInt(1, preso.getIdPreso());
            ps.setString(2, preso.getNome());
            ps.setString(3, preso.getDataNascimento());
            ps.setString(4, preso.getCpf());
            ps.setInt(5, preso.getIdCela());
            ps.setString(6, preso.getDataEntrada());
            ps.setString(7, preso.getPena());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
           return retorno; 
        }
    }
     
     
       public boolean excluir(PresoModel produto) {
        
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "DELETE FROM produto WHERE id = ?";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
            ps.setInt(1, produto.getIdPreso());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
            return retorno;
        }       
    }       
    
}

   



