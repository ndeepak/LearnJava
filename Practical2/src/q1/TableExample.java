package q1;

import javax.swing.*;
import javax.swing.event.*;

public class TableExample {
	public static void main(String[] a) {
		JFrame f = new JFrame("Table Example");
		String data[][] = { { "101", "Deepak", "100000" }, { "102", "Samjhana", "200000" }, { "101", "SamDeep", "800000" } };
		String column[] = { "ID", "NAME", "SALARY(USD)" };
		final JTable jt = new JTable(data, column);
		jt.setCellSelectionEnabled(true);
		ListSelectionModel select = jt.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		select.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String Data = null;
				int[] row = jt.getSelectedRows();
				int[] columns = jt.getSelectedColumns();
				for (int i = 0; i < row.length; i++) {
					for (int j = 0; j < columns.length; j++) {
						Data = (String) jt.getValueAt(row[i], columns[j]);
					}
				}
				System.out.println("Table element selected is: " + Data);
			}
		});
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setSize(300, 200);
		f.setVisible(true);
	}
}