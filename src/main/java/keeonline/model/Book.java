package keeonline.model;

public final class Book extends Product {
	public enum BookCategory {
		Biography,Fiction,History,Travel,Reference,Unknown;
	}

	private BookCategory category;
	private Integer publicationId;
	
	public Book() {
		super();
		setProductType("Book");
	}

	public Book(String title,Integer publicationId,String category) {
		super("Book",title);
		this.setPublicationId(publicationId);
		this.setCategory(category);
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category.toString();
	}

	public void setCategory(String type) {
		try {
			this.category = BookCategory.valueOf(type);
		}
		catch (IllegalArgumentException e) {
			this.category = BookCategory.Unknown;
		}
	}

	public Integer getPublicationId() {
		return publicationId;
	}

	public void setPublicationId(Integer publicationId) {
		this.publicationId = publicationId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((publicationId == null) ? 0 : publicationId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (publicationId == null) {
			if (other.publicationId != null)
				return false;
		} else if (!publicationId.equals(other.publicationId))
			return false;
		return true;
	}
	
}
