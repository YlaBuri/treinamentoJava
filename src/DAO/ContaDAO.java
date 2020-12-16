package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Conta;
import util.ConnectionFactory;

public class ContaDAO {

	private Connection con;

	public ContaDAO() {
		this.con = new ConnectionFactory().getConnection();
	}

	public void inserir(Conta c) {
		String sql = "insert into contas (nome_cliente, cpf, saldo, limite, rendimento) values (?,?,?,?,?);";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, c.getNomeCliente());
			stmt.setString(2, c.getCpf());
			stmt.setFloat(3, c.getSaldo());
			stmt.setFloat(4, c.getLimite());
			stmt.setFloat(5, c.getRendimento());

			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
}
