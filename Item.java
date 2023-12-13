Public class Item extends TangibleAsset {
	private int itemnumber;
	public Item (String name, int price, String color, String itemnumber) {
		super (name, price, color);
		this.itemnumber = itemnumber;
	}

	public int getItemnumber() { return this.itemnumber; }
}
