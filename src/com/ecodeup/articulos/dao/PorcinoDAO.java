package com.ecodeup.articulos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ecodeup.articulos.model.Porcino;
import com.ecodeup.articulos.model.Conexion;


public class PorcinoDAO {
	private Conexion con;
	private Connection connection;

	public PorcinoDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	// insertar porcino
	public boolean insertar(Porcino porcino) throws SQLException {
		String sql = "INSERT INTO porcino (Identificacion, Raza, Edad, Peso, Alimentacion, Cliente) VALUES (?, ?, ?,?,?,?)";
		System.out.println(porcino.getCliente());
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, null);
		statement.setString(2, porcino.getRaza());
		statement.setInt(3, porcino.getEdad());
		statement.setInt(4, porcino.getPeso());
		statement.setString(5, porcino.getAlimentacion());
		statement.setString(6, porcino.getCliente());

		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowInserted;
	}

	// listar todos los porcinos
	public List<Porcino> listarPorcino() throws SQLException {

		List<Porcino> listaPorcino = new ArrayList<Porcino>();
		String sql = "SELECT * FROM porcino";
		con.conectar();
		connection = con.getJdbcConnection();
		Statement statement = connection.createStatement();
		ResultSet resulSet = statement.executeQuery(sql);

		while (resulSet.next()) {
			int Identificacion = resulSet.getInt("Identificacion");
			String Raza = resulSet.getString("Raza");
			int Edad = resulSet.getInt("Edad");
			int Peso = resulSet.getInt("Peso");
			String Alimentacion = resulSet.getString("Alimentacion");
			String Cliente = resulSet.getString("Cliente");
			Porcino porcino = new Porcino(Identificacion, Raza, Edad, Peso, Alimentacion, Cliente);
			listaPorcino.add(porcino);
		}
		con.desconectar();
		return listaPorcino;
	}

	// obtener por Identificacion
	public Porcino obtenerPorIdentificacion(int Identificacion) throws SQLException {
		Porcino porcino = null;

		String sql = "SELECT * FROM articulos WHERE Identificacion= ? ";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, Identificacion);

		ResultSet res = statement.executeQuery();
		if (res.next()) {
			porcino = new Porcino(res.getInt("Identificacion"), res.getString("Raza"), res.getInt("Edad"),
					res.getInt("Peso"), res.getString("Alimentacion"), res.getString("Cliente"));
		}
		res.close();
		con.desconectar();

		return porcino;
	}

	// actualizar porcino
	public boolean actualizar(Porcino porcino) throws SQLException {
		boolean rowActualizar = false;
		String sql = "UPDATE porcino SET Raza=?, Edad=?, Peso=?, Alimentacion=?, Cliente=? WHERE Identificacion=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, porcino.getRaza());
		statement.setInt(2, porcino.getEdad());
		statement.setInt(3, porcino.getPeso());
		statement.setString(4, porcino.getAlimentacion());
		System.out.println(porcino.getCliente());
		statement.setString(5, porcino.getCliente());
		statement.setInt(6, porcino.getIdentificacion());

		rowActualizar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowActualizar;
	}
	
	//eliminar
	public boolean eliminar(Porcino porcino) throws SQLException {
		boolean rowEliminar = false;
		String sql = "DELETE FROM porcino WHERE Identificacion=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, porcino.getIdentificacion());

		rowEliminar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();

		return rowEliminar;
	}

}
