package model;

import java.util.ArrayList;
import java.util.Vector;

import persistence.AccountUtility;

public class PlayersListModel extends FixedTableModel {
	private static Vector<String> columnIdentifier = new Vector<>();

	static {
		columnIdentifier.add("Player");
	}

	public PlayersListModel() {
		super();
		this.setColumnIdentifiers(columnIdentifier);
		allPlayers();
	}

	public void allPlayers() {
		Vector<Vector<String>> playersVector = new Vector<>();
		ArrayList<String> players = AccountUtility.getAllPlayers();
		for (String a : players) {
			Vector<String> row = new Vector<>();
			row.add(a);
			playersVector.add(row);
		}
		this.setDataVector(playersVector, columnIdentifiers);
		this.fireTableDataChanged();
	}
}