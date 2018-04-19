package service;

import java.util.ArrayList;
import java.util.List;

import dao.PaisDAO;
import model.Pais;

public class PaisService {
	
	PaisDAO dao = new PaisDAO();
	
	public int criar(Pais pais) {
		
		return dao.criar(pais);
	}
	
	public void atualizar(Pais pais) {
		 dao.atualizar(pais);
	}
	
	public void excluir(int id) {
		dao.excluir(id);
	}
	
	public Pais carregar(int id) {
		
		return dao.carregar(id);
	}
	
	 public Pais maiorPopulacao() {
		 return dao.maiorPopulacao();
	 }
	 
	 public Pais menorPopulacao() {
		 return dao.menorPopulacao();
	 }
	 
	 public ArrayList<Pais> vetor(){
		 return dao.vetor();
	 }
	
	 public List<Pais> listar() {
			return dao.listar();
		}
	
	

}
