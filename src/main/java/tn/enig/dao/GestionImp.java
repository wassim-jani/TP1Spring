package tn.enig.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import tn.enig.model.Departement;
import tn.enig.model.Employe;
import tn.enig.model.Projet;

public class GestionImp implements IGestion{
	
	@Autowired
	@Qualifier(value="datasource")
	DataSource data;
	
	public void setData(DataSource data) {
		this.data=data;
	}
	
	
	public List<Departement> getAllDepartement() {
		List<Departement> D=null;
		try {
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from departement ");
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				Departement D1=new Departement(rs.getInt("id"),rs.getString("nom") );
						D.add(D1);
						
			};
			
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return D;

	}

	
	
	
	
	
	
	
	public List<Employe> getEmployeByDepId(int num) {
		List<Employe> L=null;
		try {
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from employe where dept=?");
			pr.setInt(1, num);
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				Employe e=new Employe(rs.getInt("id"),rs.getString("nom"),rs.getString("fonct"));
				L.add(e);
							}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return L;
			}
		
	

	public List<Employe> getEmployeByProjetId(int id) {
		
		List<Employe> L=null;
		try {
			Connection con=data.getConnection();
			PreparedStatement pr=con.prepareStatement("select * from employe where projet=?");
			pr.setInt(1, id);
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				Employe e=new Employe(rs.getInt("id"),rs.getString("nom"),rs.getString("fonct"));
				L.add(e);
							}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return L;
		
	}
	
	
	
	
	
	
	
	

	public List<Projet> getProjetByDepId(int num) {
		 List<Projet> P=null;
	try {
		Connection con=data.getConnection();
		PreparedStatement pr=con.prepareStatement("select * from projet where dept=?");
		pr.setInt(1, num);
		ResultSet rs=pr.executeQuery();
		while(rs.next()) {
			Projet p= new Projet(rs.getInt("id"),rs.getString("titre"),rs.getInt("etat"));
			P.add(p);
		}

	
	
	
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return P;
	
	
	
	}
	
	
	
	
	
	public void ajoutProjet(Projet p) {
	
	
	try {
		Connection cnx=data.getConnection();
		String req="INSERT INTO projet values (NULL,?,?,?)";
		PreparedStatement pr=cnx.prepareStatement(req);
		pr.setString(1, p.getTitre());
		pr.setInt(2, p.getEtat());
		pr.setObject(3, p.getDep());
		pr.executeUpdate();
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
	
	
	
	
	
	
	

	public void ajoutEmploye(Employe e) {
		try {
		Connection cnx=data.getConnection();
		String req="INSERT INTO projet values (NULL,?,?,?,?)";
		PreparedStatement pr=cnx.prepareStatement(req);
		pr.setString(1, e.getNom());
		pr.setString(2, e.getFonct());
		pr.setObject(3, e.getDep());
		pr.setObject(4, e.getProjet());
		pr.executeUpdate();
			
	} catch (SQLException ea) {
		// TODO Auto-generated catch block
		ea.printStackTrace();
	}
	}
	


	


	


	
	
	

}
