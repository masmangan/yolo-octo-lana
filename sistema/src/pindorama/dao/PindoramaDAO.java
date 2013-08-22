package pindorama.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import pindorama.pojo.Conta;

public class PindoramaDAO {

	public Conta findContaByCPF(String cpf) {
		Conta conta = null;
		String cmd = "select * from pdr_contas where cpf= ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties props = new Properties();
			props.load(new FileInputStream("pindorama.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, cpf);
			rs = st.executeQuery();

			while (rs.next()) {
				int contaId = rs.getInt(1);
				String cpfBD = rs.getString("cpf");
				String nome = rs.getString(3);
				String numero = rs.getString(4);
				conta = new Conta(contaId, cpfBD, nome, numero);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {

					st.close();
				}
				if (db != null) {

					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return conta;
	}
}
