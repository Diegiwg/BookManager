package view.components;

public class Table {
	private String[] headers;
	private String[][] rows;

	public Table(String[] headers, String[][] rows) {
		this.headers = headers;
		this.rows = rows;
	}

	public void show() {
		System.out.println(String.join("\t", headers));
		for (String[] row : rows) {
			System.out.println(String.join("\t", row));
		}
	}

	public void showf() {
		String m_line = repeat("-", headers.length * 30 + headers.length * 2 - 1);
		System.out.println(m_line);

		for (String header : headers) {
			String offset = repeat(" ", 30 - header.length());
			System.out.print(header + offset + "| ");
		}
		System.out.println();

		for (String[] row : rows) {
			for (String cell : row) {
				cell = cell.trim();

				String m_cell = "";
				if (cell.length() < 30) {
					String offset = repeat(" ", 30 - cell.length());
					m_cell = cell + offset;
				} else {
					m_cell = cell.substring(0, 30);
				}
				System.out.print(m_cell + "| ");
			}
			System.out.println();
		}

		System.out.println(m_line);
	}

	public String repeat(String charr, int times) {
		return new String(new char[times]).replace("\0", charr);
	}
}
