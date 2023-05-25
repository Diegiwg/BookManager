package config;

public class Config {
	public static final String DB_PATH = "jdbc:sqlite:database.sqlite";

	public static final String SYS_TITLE = "CedroTeca";
	public static final String SYS_VERSION = "v0.0.4";

	public static final String SYS_INFO = SYS_TITLE + " - " + SYS_VERSION;

	private Config() {
	}
}
