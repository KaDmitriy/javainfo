package app.kadmitriy.javainfo;

import java.util.Objects;

public class StructureInfo {

	private String key;
	private String val;

	public StructureInfo(String key, String val) {
		super();
		this.key = key;
		this.val = val;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, val);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StructureInfo other = (StructureInfo) obj;
		return Objects.equals(key, other.key) && Objects.equals(val, other.val);
	}

	@Override
	public String toString() {
		return "StructureInfo [key=" + key + ", val=" + val + "]";
	}
	
}
