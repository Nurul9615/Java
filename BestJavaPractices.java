public class DataHolder {
	public final string data;

	public DataHolder(String data) {
		this.data = data;
	}
}

public class ComplicatedDataHolder {
	public final String data;
	public final int num;

	// Constructs an object
	public static class Builder {
		private String data;
		private int num;

		public Builder data(String data) {
			this.data = data;
			return this;
		}

		public Builder num(int num) {
			this.num = num;
			return this;
		}

		// Call build to emit an immutable object
		public ComplicatedDataHolder build() {
			return new ComplicatedDataHolder(data, num);
		}
	}
}

final ComplicatedDataHolder cdh = new ComplicatedDataHolder.Builder()
	.data("set this")
	.num(523)
	.build();